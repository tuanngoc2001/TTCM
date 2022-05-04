package com.example.ttcm.Model;

public class im_Detail_Receipt {
    private String Id;
    private String ReceiptId;
    private float Price;
    private int Amount;

    public im_Detail_Receipt(String id, String receiptId, float price, int amount) {
        Id = id;
        ReceiptId = receiptId;
        Price = price;
        Amount = amount;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getReceiptId() {
        return ReceiptId;
    }

    public void setReceiptId(String receiptId) {
        ReceiptId = receiptId;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }
}
