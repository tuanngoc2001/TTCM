package com.example.ttcm.activity;

public class DanhMuc {
    private String id;
    private String tendanhmuc;
    private int hinhdanhmuc;

    public DanhMuc(String id, String tendanhmuc, int hinhdanhmuc) {
        this.id = id;
        this.tendanhmuc = tendanhmuc;
        this.hinhdanhmuc = hinhdanhmuc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTendanhmuc ()
    {
        return tendanhmuc;
    }

    public void setTendanhmuc (String tendanhmuc)
    {
        this.tendanhmuc = tendanhmuc;
    }

    public int getHinhdanhmuc ()
    {
        return hinhdanhmuc;
    }

    public void setHinhdanhmuc (int hinhdanhmuc)
    {
        this.hinhdanhmuc = hinhdanhmuc;
    }
}
