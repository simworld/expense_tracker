package tracker;

public class Menu {
    public void printMenu(){
        System.out.println("*****Expense Tracker*****");
        System.out.println("1. Shows Categories");
        System.out.println("2. Add Expense");
        System.out.println("0. Exit\n");
    }

    public void printCategories(){
        System.out.println("Select a Category");
        System.out.println("1. Home");
        System.out.println("2. Car");
        System.out.println("3. Shopping");
    }
}
