package com.example.ttcm.activity;

public class MonAnTrangChu {
    private String Name;
    private String Decription;
    private String Image;
    private Float Price;

    public MonAnTrangChu(String name, String decription, String image, Float price) {
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

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
    }
}
