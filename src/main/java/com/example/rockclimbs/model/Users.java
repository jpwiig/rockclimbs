package com.example.rockclimbs.model;

public class Users {
    private int id;
    private String email;
    private String userName;
    private String password;
    private int country;

    public Users(){}

    public Users(int id, String email, String userName, String password, int country) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.country = country;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }
    private static String cryptingPassword(String password){
        //makes sure that the password that are not stored in cleared text
        return "ja";
    }
}
