package com.example.ttcm.Model;

public class im_Cart {
    private String Id;
    private String productId;
    private int Quality;
    private String UserId;

    public im_Cart(String id, String productId, int quality, String userId) {
        Id = id;
        this.productId = productId;
        Quality = quality;
        UserId = userId;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuality() {
        return Quality;
    }

    public void setQuality(int quality) {
        Quality = quality;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }
}
