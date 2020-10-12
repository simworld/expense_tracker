package tracker;

import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Category cat1 = new Category("Travel");
        Expense ex1 = new Expense(cat1.getCategoryId(), cat1.getName(), 3.3);
        //System.out.println(cat1.getName());
//        System.out.println(ex1.getAmount());
//        System.out.println(ex1.getName());

        Repository lista = new Repository(cat1, ex1);
//        lista.add(cat1);
//        for(Repository list : lista){
//            System.out.println(list.getName());
//        }
        System.out.println(lista.toString());
    }
}
