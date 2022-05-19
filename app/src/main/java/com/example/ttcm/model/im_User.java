package com.example.ttcm.model;

public class im_User {
    private int Id;
    private String Name;
    private String Address;
    private String Password;
    private String Username;
    private String UrlImage;

    public im_User(int id, String name, String address, String password, String username,String urlImage) {
        Id = id;
        Name = name;
        Address = address;
        Password = password;
        Username = username;
        UrlImage=urlImage;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getUrlImage() {
        return UrlImage;
    }

    public void setUrlImage(String urlImage) {
        UrlImage = urlImage;
    }
}