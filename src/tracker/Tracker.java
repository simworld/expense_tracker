package tracker;

import java.util.*;
import java.io.*;

public class Tracker {
    //    private static int choice;
    private static String fileName = "output.txt";
    private static Repository repo = Repository.getRepository();
    private static Scanner scanner = new Scanner(System.in);
    private static List<Expense> elist = repo.expenseList;


    public static void addExpense(Integer categ) {
        Category choice = repo.catList.get(categ-1);
//        repo.getCatList().add(cat);
        System.out.println("Type the Amount");
        Double amt = scanner.nextDouble();
        Date date = new Date();
        Expense exp = new Expense(choice.getCategoryId(), choice.getName(), amt, date);
        repo.getExpenseList().add(exp);
        System.out.println("Expense added!");
//        List<Expense> elist = repo.expenseList;
        for (Expense eliste : elist) {
            System.out.println("Category:" + eliste.getName() + "\n" + "Amount:" + eliste.getAmount() + "\n" + "Category ID:" + eliste.getCategoryId() + "\n" + "Expense ID:" + eliste.getExpenseId() + "\n" + "Date:" + eliste.getDate() + "\n");
        }
    }

    public static void showExpense(){
        if (elist.isEmpty()) {
            System.out.println("No expenses created!\n");
        }
        for (Expense eliste : elist) {
            System.out.println("Category:" + eliste.getName() + "\n" + "Amount:" + eliste.getAmount() + "\n" + "Category ID:" + eliste.getCategoryId() + "\n" + "Expense ID:" + eliste.getExpenseId() + "\n" + "Date:" + eliste.getDate() + "\n");
        }
    }

    public static void displayReport(){

    }

    public static void createCategories() {
        Category cat = new Category(UUID.randomUUID(), "Home");
        Category cat1 = new Category(UUID.randomUUID(), "Car");
        Category cat2 = new Category(UUID.randomUUID(), "Shopping");
        repo.getCatList().add(cat);
        repo.getCatList().add(cat1);
        repo.getCatList().add(cat2);
//        System.out.println(cat.getCategoryId() + "\n" + cat1.getCategoryId() + "\n" + cat2.getCategoryId());
    }

    public static void showCategory() {
        List<Category> clist = repo.catList;
        if (clist.isEmpty()) {
            System.out.println("No categories created!\n");
        }
        for (Category cliste : clist) {
            System.out.println("Category: " + cliste.getName() + "\n" + "ID: " + cliste.getCategoryId());
//            System.out.println(clist);
        }
    }

    public static void saveToFile(){
        try {
            ObjectOutputStream fileOut = new ObjectOutputStream(new FileOutputStream(fileName));
            System.out.println("File saved successfully!");
            for (Expense eliste : elist) {
                fileOut.writeObject(eliste.getName());
                fileOut.writeObject(eliste.getAmount());
                System.out.println(eliste.getName());
            }
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void openFile(){
        try {
            ObjectInputStream fileIn = new ObjectInputStream(new FileInputStream(fileName));
            System.out.println("Opened file successfully!");

            for (Expense eliste : elist) {
                fileIn.readObject();
                System.out.println("Category:" + eliste.getName() + "\n" + "Amount:" + eliste.getAmount() + "\n" + "Category ID:" + eliste.getCategoryId() + "\n" + "Expense ID:" + eliste.getExpenseId() + "\n" + "Date:" + eliste.getDate() + "\n");
            }
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


