package patterns.composite;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MealPlanner {
    public static void main(String[] args) {
        // Creating ingredients
        Ingredient tomato = new Ingredient("Tomato", BigDecimal.valueOf(1.0));
        Ingredient cheese = new Ingredient("Cheese", BigDecimal.valueOf(2.0));
        Ingredient bread = new Ingredient("Bread", BigDecimal.valueOf(1.5));

        // Creating recipes
        Recipe sandwich = new Recipe("Sandwich");
        sandwich.addIngredient(tomato);
        sandwich.addIngredient(cheese);
        sandwich.addIngredient(bread);

        Recipe salad = new Recipe("Salad");
        salad.addIngredient(tomato);
        salad.addIngredient(cheese);

        // Creating a meal
        Recipe meal = new Recipe("Meal");
        meal.addIngredient(sandwich);
        meal.addIngredient(salad);

        // Calculating total cost of the meal
        BigDecimal totalCost = meal.getCost();
        totalCost = totalCost.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Total cost of the meal: $" + totalCost);
    }
}
