package com.example.sqlitesinhvien;

import java.io.Serializable;

public class SinhVien implements Serializable {
    private String maSV;
    private String tenSV;
    private String mota;
    private int diem;
    private String maLop;

    public SinhVien(String maSV, String tenSV, String mota, int diem, String maLop) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.mota = mota;
        this.diem = diem;
        this.maLop = maLop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
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
