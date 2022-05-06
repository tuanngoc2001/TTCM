package com.example.ttcm.model;

public class im_User {
    private String Id;
    private String Name;
    private String Address;
    private String Password;
    private String Username;

    public im_User(String id, String name, String address, String password, String username) {
        Id = id;
        Name = name;
        Address = address;
        Password = password;
        Username = username;
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
}