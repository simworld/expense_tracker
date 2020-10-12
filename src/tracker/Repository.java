package tracker;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    public Repository(List<Expense> expenseList, List<Category> catList) {
        this.expenseList = expenseList;
        this.catList = catList;
    }

    public Repository(Category cat1, Expense ex1) {
    }

    public List<Expense> getExpenseList() {
        return expenseList;
    }

    public void setExpenseList(List<Expense> expenseList) {
        this.expenseList = expenseList;
    }

    public List<Category> getCatList() {
        return catList;
    }

    public void setCatList(List<Category> catList) {
        this.catList = catList;
    }

    public List<Expense> expenseList;
    public List<Category> catList;
    public static Repository repository;

    private Repository(){
    }

    public static Repository getRepository(){
        if(repository ==null){
            repository = new Repository();
        }
        return repository;
    }

    public String toString(){
        return "Category" + getRepository().getCatList() + "Expenses" + getRepository().getExpenseList();
    }
}
