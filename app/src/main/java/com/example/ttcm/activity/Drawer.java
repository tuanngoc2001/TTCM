package com.example.ttcm.activity;

public class Drawer {
    private int Image;
    private String Title;
    private int Id;

    public Drawer(int image, String title, int id) {
        Image = image;
        Title = title;
        Id = id;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
