package com.example.ttcm.model;

public class Cart {
    private String CartId;
    private int UserId;
    private int ProductId;
    private int Quality;

    public Cart() {
    }

    public Cart(String cartId, int userId, int productId, int quality) {
        CartId = cartId;
        UserId = userId;
        ProductId = productId;
        Quality = quality;
    }

    public String getCartId() {
        return CartId;
    }

    public void setCartId(String cartId) {
        CartId = cartId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
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
}
