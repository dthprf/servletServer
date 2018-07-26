package com.codecool.servletServer.Model;

import java.util.ArrayList;
import java.util.Date;

public class MealOffer {
    private int offerId;
    private float price;
    private ArrayList<String> location;
    private String description;
    private String userLogin;
    private Date expDate;

    public MealOffer(int offerId, float price, ArrayList<String> location, String description, String userLogin, Date expDate) {
        this.offerId = offerId;
        this.price = price;
        this.location = location;
        this.description = description;
        this.userLogin = userLogin;
        this.expDate = expDate;
    }

    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public ArrayList<String> getLocation() {
        return location;
    }

    public void setLocation(ArrayList<String> location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
}
