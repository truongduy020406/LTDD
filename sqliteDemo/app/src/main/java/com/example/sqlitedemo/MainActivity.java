package com.example.sqlitedemo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class MainActivity extends AppCompatActivity {
    private SQLiteDatabase db_122;
    private ListView lvdatas_122;
    private Button btnadds_122,xoa_122,btnupdate_122;
    private EditText editname_122, editphone_122,editid_122;

    private ArrayAdapter<user> adapter;
    private ArrayList<user> userlist = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdata();
        lvdatas_122 = findViewById(R.id.lvdata);
        editname_122 = findViewById(R.id.editname);
        editphone_122 = findViewById(R.id.editphone);
        editid_122 = findViewById(R.id.id);
        btnadds_122 = findViewById(R.id.btnAdd);


        btnupdate_122 = findViewById(R.id.btnupdate);
        btnupdate_122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update();
                loaddata();
            }
        });
        btnadds_122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertrow();
                loaddata();
            }
        });
        xoa_122= findViewById(R.id.btnXoa);
        xoa_122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deleteContact();
                loaddata();
            }
        });
        adapter = new ArrayAdapter<user>(this,0,userlist){

            public View getView(int position,View convertView, ViewGroup parent) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.item,null);
                TextView tvname =convertView.findViewById(R.id.tvname);
                TextView tvphone =convertView.findViewById(R.id.tvphone);
                TextView tvid = convertView.findViewById(R.id.tvid);

                user u = userlist.get(position);
                tvid.setText(u.getId());
                tvname.setText(u.getName());
                tvphone.setText(u.getTheloai());
                return convertView;
            }
        };


        lvdatas_122.setAdapter(adapter);

        loaddata();
    }

    private void initdata(){
        db_122= openOrCreateDatabase("QuanLySinhVien.db",MODE_PRIVATE,null);

        String sql ="CREATE TABLE IF NOT EXISTS SinhVien (id text primary key ,name text, theloai text references createCategory(maCategory) on delete cascade )";
        db_122.execSQL(sql);
    }


    private void insertrow(){
        String id = editid_122.getText().toString();
        String name = editname_122.getText().toString();
        String theloai = editphone_122.getText().toString();
        String sql = "INSERT INTO SinhVien (id,name,theloai) values ('" + id +"','" + name +"','" + theloai +"')";
        db_122.execSQL(sql);
    }
    public void deleteContact()
    {
        String id = editid_122.getText().toString();
        db_122.delete("SinhVien","id=?",new String[]{id});
    }

    public boolean update()
    {
        String id = editid_122.getText().toString();
        String name = editname_122.getText().toString();
        String theloai = editphone_122.getText().toString();
        ContentValues cv = new ContentValues();
        cv.put("name",name);
        cv.put("theloai",theloai);
        db_122.update("SinhVien", cv, "id =?", new String[]{id});
        return true;
    }


    private void loaddata(){
         userlist.clear();
        String sql = "SELECT * FROM SinhVien";
        Cursor cursor =db_122.rawQuery(sql,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            String id =cursor.getString(0);
            String name = cursor.getString(1);
            String thloai = cursor.getString(2);
             user u = new user();
             u.setId(id);
             u.setName(name);
             u.setTheloai(thloai);
            userlist.add(u);
            cursor.moveToNext();
        }
        adapter.notifyDataSetChanged();
    }
}