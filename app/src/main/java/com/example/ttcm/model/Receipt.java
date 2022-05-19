package com.example.ttcm.model;

public class Receipt {
    private int ProductId;
    private int Quality;
    private int UserId;
    private double TotalPrice;

    public Receipt(int productId, int quality, int userId, double totalPrice) {
        ProductId = productId;
        Quality = quality;
        UserId = userId;
        TotalPrice = totalPrice;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public int getQuality() {
        return Quality;
    }

    public void setQuality(int quality) {
        Quality = quality;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }
}
