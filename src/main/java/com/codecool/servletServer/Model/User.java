package com.codecool.servletServer.Model;

public class User {
    private String login;
    private String email;
    private Integer password;
    private float rating;
    private String about;

    public User(String login, String email, Integer password, float rating, String about) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.rating = rating;
        this.about = about;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
