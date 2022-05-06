package com.example.ttcm.data;

public class MonAnThanhToan {
    private String tenMon;
    private int giaMon;
    private int giaThanhTien;
    private int soLuong;
    private int HinhMonAn;
    private int HinhXoa;
    private int HinhCong;
    private int HinhTru;


    public MonAnThanhToan(String tenMon, int giaMon, int giaThanhTien, int soLuong, int hinhMonAn, int hinhXoa, int hinhCong, int hinhTru) {
        this.tenMon = tenMon;
        this.giaMon = giaMon;
        this.giaThanhTien = giaThanhTien;
        this.soLuong = soLuong;
        HinhMonAn = hinhMonAn;
        HinhXoa = hinhXoa;
        HinhCong = hinhCong;
        HinhTru = hinhTru;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getGiaMon() {
        return giaMon;
    }

    public void setGiaMon(int giaMon) {
        this.giaMon = giaMon;
    }

    public int getGiaThanhTien() {
        return giaThanhTien;
    }

    public void setGiaThanhTien(int giaThanhTien) {
        this.giaThanhTien = giaThanhTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getHinhMonAn() {
        return HinhMonAn;
    }

    public void setHinhMonAn(int hinhMonAn) {
        HinhMonAn = hinhMonAn;
    }

    public int getHinhXoa() {
        return HinhXoa;
    }

    public void setHinhXoa(int hinhXoa) {
        HinhXoa = hinhXoa;
    }

    public int getHinhCong() {
        return HinhCong;
    }

    public void setHinhCong(int hinhCong) {
        HinhCong = hinhCong;
    }

    public int getHinhTru() {
        return HinhTru;
    }

    public void setHinhTru(int hinhTru) {
        HinhTru = hinhTru;
    }
}

