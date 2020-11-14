package tracker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Expense {

    private Long expenseId = System.currentTimeMillis();
    private UUID categoryId;
    private String name;
    private Date date;

    private Double amount;


    public Expense() {
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Expense(UUID categoryId, String name, Double amount, Date date) {
        this.categoryId = categoryId;
        this.name = name;
        this.amount = amount;
        this.date = date;

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


    public UUID getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
    }
}
