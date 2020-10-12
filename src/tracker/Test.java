package tracker;

import java.text.NumberFormat;
import java.util.*;
import java.io.*;

public class Test {


    public static void main(String[] args) {
        Repository repo = Repository.getRepository();
        Scanner scanner = new Scanner(System.in);
        //Category cat = new Category("Travel");
        //Expense ex = new Expense(cat.getCategoryId(), cat.getName(), 3.3);
        //System.out.println(cat1.getName());
//        System.out.println(ex1.getAmount());
//        System.out.println(ex1.getName());
        System.out.println("Enter a Category:");
        Category cat = new Category(scanner.next());
//        System.out.println("Category inserted is: " + cat.getName() );
        repo.getCatList().add(cat);
        List<Category> clist = repo.catList;
        for (Category cliste : clist) {
            System.out.println(cliste.getName());
        }

        System.out.println("Enter an Expense:");
        System.out.println("Type the Category:");
        String cat1 = scanner.next();
        System.out.println("Type the Amount");
        Double amt = scanner.nextDouble();
        Expense exp = new Expense(cat.getCategoryId(), cat.getName(), amt);
        repo.getExpenseList().add(exp);
        List<Expense> elist = repo.expenseList;
        for (Expense eliste : elist){
            System.out.println("Category:"+ eliste.getName() + "\n" + "Amount:" + eliste.getAmount() + "\n" + "Category ID:" + eliste.getCategoryId() + "\n" + "Expense ID:" + eliste.getExpenseId());
        }
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
