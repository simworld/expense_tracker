package tracker;

import java.text.NumberFormat;
import java.util.*;
import java.io.*;

public class Start {
    private static int choice;
    //    private static Repository repo = Repository.getRepository();
    private static Scanner scanner = new Scanner(System.in);
//
//    public static void addExpense(String name) {
//        Category cat = new Category(name);
//        repo.getCatList().add(cat);
//        System.out.println("Type the Amount");
//        Double amt = scanner.nextDouble();
//        Expense exp = new Expense(cat.getCategoryId(), cat.getName(), amt);
//        repo.getExpenseList().add(exp);
//        List<Expense> elist = repo.expenseList;
//        for (Expense eliste : elist) {
//            System.out.println("Category:" + eliste.getName() + "\n" + "Amount:" + eliste.getAmount() + "\n" + "Category ID:" + eliste.getCategoryId() + "\n" + "Expense ID:" + eliste.getExpenseId() + "\n");
//        }
//    }

//    public  void showCategory(){
//        List<Category> clist = repo.catList;
//        if(clist.isEmpty()){
//            System.out.println("No categories created!");
//        }
//        for (Category cliste : clist) {
//            System.out.println(cliste.getName());
//            System.out.println(clist);
//        }


    public static void main(String[] args) {
        String fileName = "output.txt";

        //Create the categories objects

//        Category car = new Category("Car");
//        repo.getCatList().add(car);
//        Category shop = new Category("Shopping");
//        repo.getCatList().add(shop);

        Menu menu = new Menu();

        while (true) {
            menu.printMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Bye!");
                    System.exit(0);
                case 1:
                    Tracker.showCategory();
                    break;
                case 2:
                    menu.printCategories();
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            Tracker.addExpense("Home");
                            break;
                        case 2:
                            Tracker.addExpense("Car");
                            break;
                        case 3:
                            Tracker.addExpense("Shopping");
                            break;
                    }
            }
        }
        //Category cat = new Category("Travel");
        //Expense ex = new Expense(cat.getCategoryId(), cat.getName(), 3.3);
        //System.out.println(cat1.getName());
//        System.out.println(ex1.getAmount());
//        System.out.println(ex1.getName());


//            System.out.println("Enter a Category:");
//            Category cat = new Category(scanner.next());
//            repo.getCatList().add(cat);
//            List<Category> clist = repo.catList;
//            for (Category cliste : clist) {
//                System.out.println(cliste.getName());
//                System.out.println(clist);
//            }
//            switch (choice){
//                case 1:
//                    System.out.println("Home selected");
//                    Home cat = new Home("Home");
//            }


        //            System.out.println("Enter an Expense:");
        //            System.out.println("Type the Category:");
        //            String cat1 = scanner.next();


//            for (Expense eliste : elist) {
//                System.out.println("Category:" + eliste.getName() + "\n" + "Amount:" + eliste.getAmount() + "\n" + "Category ID:" + eliste.getCategoryId() + "\n" + "Expense ID:" + eliste.getExpenseId());
//            }

//            try {
//                ObjectOutputStream fileOut = new ObjectOutputStream(new FileOutputStream(fileName));
//                for (Expense eliste : elist) {
//                    fileOut.writeObject(eliste.getName());
//                    fileOut.writeObject(eliste.getAmount());
//                }
//                fileOut.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

//        Repository lista = new Repository(cat, ex);
//        repo.getCatList().add(cat);
//        repo.getExpenseList().add(ex);

//        System.out.println("Insert a Category:\n");
//        String cat = scanner.next();
//        repo.catList.add(cat);
//


//        String exp = scanner.nextLine();
//        repo.getExpenseList().add(exp);

////        lista.add(cat1);
////        for(Repository list : lista){
////            System.out.println(list.getName());
////        }
//
//        System.out.println(repo.getCatList());
    }

}
