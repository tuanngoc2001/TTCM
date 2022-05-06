package com.example.ttcm.data;

import androidx.room.Entity;
import androidx.room.RoomMasterTable;

public class Mon {
    private String id;
    private String madanhmuc;
    private String tenmon;
    private int hinhmon;
    private String mota;
    private int gia;

    public Mon(String id, String madanhmuc, String tenmon, int hinhmon, String mota, int gia) {
        this.id = id;
        this.madanhmuc = madanhmuc;
        this.tenmon = tenmon;
        this.hinhmon = hinhmon;
        this.mota = mota;
        this.gia = gia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMadanhmuc() {
        return madanhmuc;
    }

    public void setMadanhmuc(String madanhmuc) {
        this.madanhmuc = madanhmuc;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public int getHinhmon() {
        return hinhmon;
    }

    public void setHinhmon(int hinhmon) {
        this.hinhmon = hinhmon;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
