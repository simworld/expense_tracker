package tracker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Repository {

    public List<Expense> expenseList = new ArrayList();
    public List<Category> catList = new ArrayList();
    public static Repository repository;

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

    private Repository(){
    }

    public static Repository getRepository(){
        if(repository ==null){
            repository = new Repository();
        }
        return repository;
    }


}
