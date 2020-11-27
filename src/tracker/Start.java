package tracker;

import java.text.NumberFormat;
import java.util.*;
import java.io.*;

public class Start {
    private static int choice;
    //    private static Repository repo = Repository.getRepository();
    private static Scanner scanner = new Scanner(System.in);
    private static DisplayReport dis = new DisplayReport();


    public static void main(String[] args) {

        Tracker.createCategories();
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
                case 6:
                    Tracker.saveToFile();
                    break;
                case 5:
                    Tracker.openFile();
                    break;
                case 4:
//                    Tracker.displayReport();
                    dis.display();
                    break;
                case 3:
                    Tracker.showExpense();
                    break;
                case 2:
                    menu.printCategories();
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            Tracker.addExpense(1);
                            break;
                        case 2:
                            Tracker.addExpense(2);
                            break;
                        case 3:
                            Tracker.addExpense(3);
                            break;
                    }
            }
        }
    }

}
