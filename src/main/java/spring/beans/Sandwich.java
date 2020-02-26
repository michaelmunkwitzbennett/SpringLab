package spring.beans;

import spring.services.RecipeService;
import spring.services.UsualService;

public class Sandwich {
    private RecipeService recipeService;

    private String name;
    private double cost;
    private String inventorName;
    private String[] ingredients;

    public Sandwich() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getInventorName() {
        return inventorName;
    }

    public void setInventorName(String inventorName) {
        this.inventorName = inventorName;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public Sandwich(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    public void setRecipeService(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
}
