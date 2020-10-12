package tracker;

import java.util.List;

public class Repository {
    public List<Expense> expenseList;
    public List<Category> catList;
    private static Repository repository;

    private Repository(){
    }

    public static Repository getRepository(){
        if(repository ==null){
            repository = new Repository();
        }
        return repository;
    }
}
