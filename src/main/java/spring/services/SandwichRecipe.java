package spring.services;

public class SandwichRecipe implements RecipeService {

    @Override
    public String[] getRecipe() {
        String[] theRecipe = {"1. Place bread down", "2. Place meat on bread", "3. Place cheese on meat", "4. Place toppings on cheese", "5. Place more bread on toppings"};
        return theRecipe;
    }
}
