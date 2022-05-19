package com.example.ttcm.model;

public class Product {
    private int Id;
    private String IdCate;
    private String name;
    private String urlImage;
    private float price;
    private String productType;
    private int quality;
    private String title;

    public Product(String name, String urlImage, float price, String productType, int quality, String title,int id,String idcate) {
        this.name = name;
        this.urlImage = urlImage;
        this.price = price;
        this.productType = productType;
        this.quality = quality;
        this.title = title;
        Id=id;
        this.IdCate=idcate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getIdCate() {
        return IdCate;
    }

    public void setIdCate(String idCate) {
        IdCate = idCate;
    }
}
