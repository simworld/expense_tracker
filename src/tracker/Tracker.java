package tracker;

import java.util.List;
import java.util.Scanner;

public class Tracker {
    //    private static int choice;
    private static Repository repo = Repository.getRepository();
    private static Scanner scanner = new Scanner(System.in);

    public Tracker() {
    }

    public static void addExpense(String name) {
        Category cat = new Category(name);
        repo.getCatList().add(cat);
        System.out.println("Type the Amount");
        Double amt = scanner.nextDouble();
        Expense exp = new Expense(cat.getCategoryId(), cat.getName(), amt);
        repo.getExpenseList().add(exp);
        List<Expense> elist = repo.expenseList;
        for (Expense eliste : elist) {
            System.out.println("Category:" + eliste.getName() + "\n" + "Amount:" + eliste.getAmount() + "\n" + "Category ID:" + eliste.getCategoryId() + "\n" + "Expense ID:" + eliste.getExpenseId() + "\n");
        }
    }

    public static void showCategory() {
        List<Category> clist = repo.catList;
        if (clist.isEmpty()) {
            System.out.println("No categories created!\n");
        }
        for (Category cliste : clist) {
            System.out.println(cliste.getName() + clist);
            System.out.println(clist);
        }
    }
}


