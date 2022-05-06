package com.example.ttcm.data;

public class MonAn {
    private String tenMon;
    private String giaMon;
    private String giaThanhTien;
    private String soLuong;
    private int HinhMonAn;
    private int HinhXoa;
    private int HinhCong;
    private int HinhTru;


    public MonAn(String tenMon, String giaMon, String giaThanhTien, String soLuong, int hinhMonAn, int hinhXoa, int hinhCong, int hinhTru) {
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

    public String getGiaMon() {
        return giaMon;
    }

    public void setGiaMon(String giaMon) {
        this.giaMon = giaMon;
    }

    public String getGiaThanhTien() {
        return giaThanhTien;
    }

    public void setGiaThanhTien(String giaThanhTien) {
        this.giaThanhTien = giaThanhTien;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
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

