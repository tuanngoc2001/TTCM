package com.example.ttcm.data;

public class MonAnTrangChu {
    private String Name;
    private String Decription;
    private int Image;
    private int Price;

    public MonAnTrangChu(String name, String decription, int image, int price) {
        Name = name;
        Decription = decription;
        Image = image;
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDecription() {
        return Decription;
    }

    public void setDecription(String decription) {
        Decription = decription;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
