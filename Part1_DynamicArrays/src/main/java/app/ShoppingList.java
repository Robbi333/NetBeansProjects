package app;

import utils.DynamicArrayList;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author michelle
 */
public class ShoppingList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DynamicArrayList List = new DynamicArrayList();
        System.out.println("Enter how many items you are purchasing");

        int numItems = sc.nextInt();

        if (numItems > 0) {
            System.out.println("Enter the items you would wish to add to your list");

            int count = 0;

            while (count <= numItems) {
                List.add(sc.nextLine());
                count++;
            }
        } else {

            System.out.println("Please enter a number greater than 0");
        }

        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }
        System.out.println("*****************");

        System.out.println("Enter an item that you would like to find ( returns the position on the list)");
        System.out.println(List.indexOf(sc.nextLine()));

        for (int i = 0; i < List.size(); i++) {

            if (i % 2 == 1) {
                List.set(i , "Milk Chocolate");
            }
        }
        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }
        System.out.println("*****************");

        List.removeAll("Milk Chocolate");

        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }
        System.out.println("*****************");

        if (List.isEmpty() == true) {

            System.out.println("There is nothing in the list currently.");
        } else {

            System.out.println("This is the size of your list");
            System.out.println(List.size());
        }
    }
}
