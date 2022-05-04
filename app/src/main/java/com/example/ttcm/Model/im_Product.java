package com.example.ttcm.Model;

public class im_Product {
    private String Id;
    private String Name;
    private String Describe;
    private float Price;
    private String Quality;
    private String UrlImage;
    public int TypeOfProduct;

    public im_Product(String id, String name, String describe, float price, String quality, String urlImage,int typeOfProduct) {
        Id = id;
        Name = name;
        Describe = describe;
        Price = price;
        Quality = quality;
        UrlImage = urlImage;
        TypeOfProduct=typeOfProduct;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        Describe = describe;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public String getQuality() {
        return Quality;
    }

    public void setQuality(String quality) {
        Quality = quality;
    }

    public String getUrlImage() {
        return UrlImage;
    }

    public void setUrlImage(String urlImage) {
        UrlImage = urlImage;
    }

    public int getTypeOfProduct() {
        return TypeOfProduct;
    }

    public void setTypeOfProduct(int typeOfProduct) {
        TypeOfProduct = typeOfProduct;
    }
}
