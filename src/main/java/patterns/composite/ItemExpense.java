package patterns.composite;

import java.math.BigDecimal;

class ItemExpense implements Expense {
    private String itemName;
    private BigDecimal expense;

    public ItemExpense(String itemName, BigDecimal expense) {
        this.itemName = itemName;
        this.expense = expense;
    }

    public BigDecimal getTotalExpense() {
        return expense;
    }
}
