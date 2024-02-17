package patterns.composite;

import java.util.List;
import java.util.ArrayList;

import java.math.BigDecimal;

class Recipe implements Component {
    private String name;
    private List<Component> ingredients;

    public Recipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Component ingredient) {
        ingredients.add(ingredient);
    }

    public void removeIngredient(Component ingredient) {
        ingredients.remove(ingredient);
    }

    @Override
    public BigDecimal getCost() {
        BigDecimal totalCost = BigDecimal.valueOf(0);

        for (Component ingredient : ingredients) {
            totalCost = totalCost.add(ingredient.getCost());
        }
        
        return totalCost;
    }
}

