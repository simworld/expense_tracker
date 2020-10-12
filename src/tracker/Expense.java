package tracker;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Expense {

    private Long expenseId = System.currentTimeMillis();
    private Long categoryId;
    private String name;

    private Double amount;


    public Expense() {
    }

    public Expense(Long categoryId, String name, Double amount) {
        this.categoryId = categoryId;
        this.name = name;
        this.amount = amount;

    }


    public Long getExpenseId() {
        return expenseId;
    }

    public String getName() {
        return name;
    }

    public Double getAmount() {
        return amount;
    }


    public void setExpenseId(Long expenseId) {
        this.expenseId = expenseId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }


    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
