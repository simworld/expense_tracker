package tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class DisplayReport {

    private static UUID reportId;
    private static Repository repo = Repository.getRepository();
    private static List<Expense> elist = repo.expenseList;
    private static Menu menu = new Menu();
    private static int choice;
    private static Scanner scanner = new Scanner(System.in);

    public void display(){
        menu.printCategories();
        choice = scanner.nextInt();
        double tot = 0.0;
        switch (choice) {
            case 1 -> {
                for (Expense eliste : elist) {
                    if (eliste.getName().equals("Home")) {
                        System.out.println("Category:" + eliste.getName() + "\n" + "Amount:" + eliste.getAmount() + "\n" + "Category ID:" + eliste.getCategoryId() + "\n" + "Expense ID:" + eliste.getExpenseId() + "\n" + "Date:" + eliste.getDate() + "\n");
                        tot = tot + eliste.getAmount();
                    }
                }
                System.out.println("Total: " + tot);
            }
            case 2 -> {
                for (Expense eliste : elist) {
                    if (eliste.getName().equals("Car")) {
                        System.out.println("Category:" + eliste.getName() + "\n" + "Amount:" + eliste.getAmount() + "\n" + "Category ID:" + eliste.getCategoryId() + "\n" + "Expense ID:" + eliste.getExpenseId() + "\n" + "Date:" + eliste.getDate() + "\n");
                        tot = tot + eliste.getAmount();
                    }
                }
                System.out.println("Total: " + tot);
            }
            case 3 -> {
                for (Expense eliste : elist) {
                    if (eliste.getName().equals("Shopping")) {
                        System.out.println("Category:" + eliste.getName() + "\n" + "Amount:" + eliste.getAmount() + "\n" + "Category ID:" + eliste.getCategoryId() + "\n" + "Expense ID:" + eliste.getExpenseId() + "\n" + "Date:" + eliste.getDate() + "\n");
                        tot = tot + eliste.getAmount();
                    }
                }
                System.out.println("Total: " + tot);
            }
        }

        }
    }







