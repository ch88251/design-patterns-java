package patterns.composite;

import java.math.BigDecimal;

public class ExpenseTracker {
    public static void main(String[] args) {
        CompositeExpense tripExpense = new CompositeExpense();

        // Air Travel
        ItemExpense airTravel = new ItemExpense("Air Travel", BigDecimal.valueOf(500.0));
        tripExpense.addExpense(airTravel);

        // Rental Car
        ItemExpense rentalCar = new ItemExpense("Rental Car", BigDecimal.valueOf(200.0));
        tripExpense.addExpense(rentalCar);

        // Hotel
        ItemExpense hotel = new ItemExpense("Hotel", BigDecimal.valueOf(300.0));
        tripExpense.addExpense(hotel);

        // Meals
        CompositeExpense meals = new CompositeExpense();
        ItemExpense breakfast = new ItemExpense("Breakfast", BigDecimal.valueOf(20.0));
        ItemExpense lunch = new ItemExpense("Lunch", BigDecimal.valueOf(30.0));
        ItemExpense dinner = new ItemExpense("Dinner", BigDecimal.valueOf(40.0));
        meals.addExpense(breakfast);
        meals.addExpense(lunch);
        meals.addExpense(dinner);
        tripExpense.addExpense(meals);

        System.out.println("Total Expense: $" + tripExpense.getTotalExpense());
    }
}