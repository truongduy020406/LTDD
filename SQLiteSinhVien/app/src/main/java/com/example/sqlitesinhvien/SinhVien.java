package com.example.sqlitesinhvien;

import java.io.Serializable;

public class SinhVien implements Serializable {
    private String maSV110;
    private String tenSV110;
    private String mota110;
    private int diem;
    private String maLop;

    public SinhVien(String maSV110, String tenSV110, String mota110, int diem, String maLop) {
        this.maSV110 = maSV110;
        this.tenSV110 = tenSV110;
        this.mota110 = mota110;
        this.diem = diem;
        this.maLop = maLop;
    }

    public String getMaSV110() {
        return maSV110;
    }

    public void setMaSV110(String maSV110) {
        this.maSV110 = maSV110;
    }

    public String getTenSV110() {
        return tenSV110;
    }

    public void setTenSV110(String tenSV110) {
        this.tenSV110 = tenSV110;
    }

    public String getMota110() {
        return mota110;
    }

    public void setMota110(String mota110) {
        this.mota110 = mota110;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
}
