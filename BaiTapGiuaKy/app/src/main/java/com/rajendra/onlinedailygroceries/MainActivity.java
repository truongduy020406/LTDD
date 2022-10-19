package com.rajendra.onlinedailygroceries;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.rajendra.onlinedailygroceries.adapter.CategoryAdapter;
import com.rajendra.onlinedailygroceries.adapter.DiscountedProductAdapter;
import com.rajendra.onlinedailygroceries.adapter.RecentlyViewedAdapter;
import com.rajendra.onlinedailygroceries.model.Category;
import com.rajendra.onlinedailygroceries.model.DiscountedProducts;
import com.rajendra.onlinedailygroceries.model.Login;
import com.rajendra.onlinedailygroceries.model.RecentlyViewed;

import java.util.ArrayList;
import java.util.List;

import static com.rajendra.onlinedailygroceries.R.drawable.*;

public class MainActivity extends AppCompatActivity {

    RecyclerView discountRecyclerView, categoryRecyclerView, recentlyViewedRecycler;
    DiscountedProductAdapter discountedProductAdapter;
    List<DiscountedProducts> discountedProductsList;

    CategoryAdapter categoryAdapter;
    List<Category> categoryList;

    RecentlyViewedAdapter recentlyViewedAdapter;
    List<RecentlyViewed> recentlyViewedList;

    TextView allCategory;
    ImageView imageProfile;

    BottomNavigationView bottomNavigationView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.profile:
                        Intent intent = new Intent(MainActivity.this , profile.class);
                        startActivity(intent);
                        return true;

                    case R.id.about:
                        Intent i = new Intent(MainActivity.this ,Login.class);
                        startActivity(i);
                        return true;
                }
                return false;
            }

        });
        discountRecyclerView = findViewById(R.id.discountedRecycler);
        categoryRecyclerView = findViewById(R.id.categoryRecycler);
        allCategory = findViewById(R.id.allCategoryImage);
        recentlyViewedRecycler = findViewById(R.id.recently_item);

        imageProfile =  findViewById(R.id.profile);

        imageProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, profile.class);
                startActivity(i);
            }
        });
        allCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AllCategory.class);
                startActivity(i);
            }
        });

        // adding data to model
        discountedProductsList = new ArrayList<>();
        discountedProductsList.add(new DiscountedProducts(1, cam));
        discountedProductsList.add(new DiscountedProducts(2, bi));
        discountedProductsList.add(new DiscountedProducts(3, cachua));
        discountedProductsList.add(new DiscountedProducts(4, oi));
        discountedProductsList.add(new DiscountedProducts(5, tao));
        discountedProductsList.add(new DiscountedProducts(6, bi));

        // adding data to model
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, ic_veggies));
        categoryList.add(new Category(2, ic_spices));
        categoryList.add(new Category(3, ic_home_meats));
        categoryList.add(new Category(4, ic_home_veggies));
        categoryList.add(new Category(5, ic_home_fruits));
        categoryList.add(new Category(6, ic_home_fish));
        categoryList.add(new Category(7, ic_home_meats));
        categoryList.add(new Category(8, ic_home_veggies));
        categoryList.add(new Category(1, ic_home_fruits));
        categoryList.add(new Category(2, ic_home_fish));
        categoryList.add(new Category(3, ic_home_meats));
        categoryList.add(new Category(4, ic_home_veggies));
        categoryList.add(new Category(5, ic_home_fruits));
        categoryList.add(new Category(6, ic_home_fish));
        categoryList.add(new Category(7, ic_home_meats));
        categoryList.add(new Category(8, ic_home_veggies));
        categoryList.add(new Category(5, ic_home_fruits));
        categoryList.add(new Category(6, ic_home_fish));
        categoryList.add(new Category(7, ic_home_meats));

        // adding data to model
       recentlyViewedList = new ArrayList<>();
       recentlyViewedList.add(new RecentlyViewed("Dưa hấu", "Dưa hấu có hàm lượng nước cao và cũng cung cấp một số chất xơ.", "8000đ", "1", "KG", card4, b4));
       recentlyViewedList.add(new RecentlyViewed("Đu Đủ", "Đu đủ là loại quả được người nông dân thích ăn nhất.", "8500", "1", "KG", card3, b3));
       recentlyViewedList.add(new RecentlyViewed("Dâu Tây", "Dâu tây là một chi thực vật hạt kín và loài thực vật có hoa thuộc họ Hoa hồng", "5000đ", "1", "KG", card2, b1));
       recentlyViewedList.add(new RecentlyViewed("Kiwi", "Kiwi là một loài cây có quả mọng ăn được ", "300đ", "1", "PC", card1, b2));

        setDiscountedRecycler(discountedProductsList);
        setCategoryRecycler(categoryList);
       setRecentlyViewedRecycler(recentlyViewedList);

    }

    private void setDiscountedRecycler(List<DiscountedProducts> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter = new DiscountedProductAdapter(this,dataList);
        discountRecyclerView.setAdapter(discountedProductAdapter);
    }


    private void setCategoryRecycler(List<Category> categoryDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        categoryRecyclerView.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this,categoryDataList);
        categoryRecyclerView.setAdapter(categoryAdapter);
    }

    private void setRecentlyViewedRecycler(List<RecentlyViewed> recentlyViewedDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recentlyViewedRecycler.setLayoutManager(layoutManager);
        recentlyViewedAdapter = new RecentlyViewedAdapter(this,recentlyViewedDataList);
        recentlyViewedRecycler.setAdapter(recentlyViewedAdapter);
    }

}
