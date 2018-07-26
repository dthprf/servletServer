package com.codecool.servletServer.Model;

import java.util.ArrayList;

public class MealDetails {
    private String title;
    private String desc;
    private Recipe recipe;

    public MealDetails(String title, String desc, Recipe recipe) {
        this.title = title;
        this.desc = desc;
        this.recipe = recipe;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
