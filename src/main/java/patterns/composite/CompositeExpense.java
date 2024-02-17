package patterns.composite;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

class CompositeExpense implements Expense {
    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void removeExpense(Expense expense) {
        expenses.remove(expense);
    }

    public BigDecimal getTotalExpense() {
        BigDecimal totalExpense = BigDecimal.ZERO;
        for (Expense expense : expenses) {
            totalExpense = totalExpense.add(expense.getTotalExpense());
        }

        totalExpense = totalExpense.setScale(2, RoundingMode.HALF_UP);
        return totalExpense;
    }
}