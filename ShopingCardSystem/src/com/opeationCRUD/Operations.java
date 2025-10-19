package com.opeationCRUD;

import com.Entityitem.productItem;

import java.util.LinkedList;
import java.util.Scanner;

import static com.operationimp.bussinesimp.*;

public class Operations {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<productItem> itemcard = new LinkedList<>();

        boolean next = true;
        while (next) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 : Add a new item ");
            System.out.println("2 : Remove item ");
            System.out.println("3 : Update item ");
            System.out.println("4 : View first and last added item ");
            System.out.println("5 : View all the items and bill ");
            System.out.println("0 : Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addNewItem(itemcard);
                case 2 -> removeItem(itemcard);
                case 3 -> updateItem(itemcard);
                case 4 -> viewFirstLastAdded(itemcard);
                case 5 -> displayAllItemsAndBill(itemcard);
                case 0 -> {
                    System.out.println("Exiting program.");
                    next = false;
                }
                default -> System.out.println("Invalid choice");
            }
        }

    }
}
