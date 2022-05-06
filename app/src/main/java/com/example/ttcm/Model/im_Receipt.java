package com.example.ttcm.Model;

public class im_Receipt {
    private String Id;
    private String UserId;
    private int Total;//tổng số sản phẩm mua hàng
    private String Anotation;

    public im_Receipt(String id, String userId, int total, String anotation) {
        Id = id;
        UserId = userId;
        Total = total;
        Anotation = anotation;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public String getAnotation() {
        return Anotation;
    }

    public void setAnotation(String anotation) {
        Anotation = anotation;
    }
}
