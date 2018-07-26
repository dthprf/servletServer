package com.codecool.servletServer.Model;

import java.util.Map;

public class Recipe {
    private Map<String, Float> recipe;

    public Recipe(Map<String, Float> recipe) {
        this.recipe = recipe;
    }

    public Map<String, Float> getRecipe() {
        return recipe;
    }

    public void setRecipe(Map<String, Float> recipe) {
        this.recipe = recipe;
    }
}


