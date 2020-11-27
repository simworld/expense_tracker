package tracker;
import java.util.*;

public class Menu {
    Date date = new Date();
    public void printMenu(){
        System.out.println("\r");
        System.out.println("*****Expense Tracker*****");
        System.out.println(date.toString());
        System.out.println("1. Shows Categories");
        System.out.println("2. Add Expense");
        System.out.println("3. Display Expenses");
        System.out.println("4. Display Report");
        System.out.println("5. Open file");
        System.out.println("6. Save to file");
        System.out.println("0. Exit");
    }

    public void printCategories(){
        System.out.println("Select a Category");
        System.out.println("1. Home");
        System.out.println("2. Car");
        System.out.println("3. Shopping");
    }
}
