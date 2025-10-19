package com.operationimp;

import com.Entityitem.productItem;

import java.lang.classfile.instruction.StackInstruction;
import java.util.LinkedList;
import java.util.Optional;

import static com.opeationCRUD.Operations.scanner;

public class bussinesimp {

    public static void addNewItem(LinkedList<productItem> itemcard) {
        scanner.nextLine(); // Clear newline
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        productItem newItem = new productItem(name, quantity, price);
        itemcard.add(newItem);
        System.out.println("Item added successfully!");
    }

    public static void removeItem(LinkedList<productItem> itemcard) {
        scanner.nextLine(); // Clear newline
        System.out.print("Enter name to delete item: ");
        String name = scanner.nextLine();

        boolean removed = itemcard.removeIf(item -> item.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public static void updateItem(LinkedList<productItem> itemcard) {
        // update the item if there is wrong item in the list than updte this item with the  original item
        // 1st serach the item that the particular item is found or not
        //  than set the item with the original item
        String itemName  ;
        System.out.println("Enter the item name ");
        itemName = scanner.nextLine() ;
         Optional<productItem>itemupdate  =itemcard.stream()
                .filter(item-> item.getName().equalsIgnoreCase(itemName))
                .findFirst() ;
         if (itemupdate.isPresent() ) {
             productItem item = new productItem() ;
             System.out.println("Enter name of the new product ");
             String name = scanner.nextLine() ;
             item.setName(name);
             System.out.println("Enter price of the new product ");
             double price = scanner.nextInt() ;
             item.setPrice(price);
             System.out.println("Enter Quantity of the product ");
             int q = scanner.nextInt() ;
             item.setQuantity(q );
         }else {
             System.out.println("Item if not found ");
         }
    }

    public static void viewFirstLastAdded(LinkedList<productItem> itemcard) {

        if (itemcard.isEmpty()) {
            System.out.println("No items in cart.");
        } else {
            System.out.println("First item: " + itemcard.getFirst());
            System.out.println("Last item: " + itemcard.getLast());
        }
    }

    public static void displayAllItemsAndBill(LinkedList<productItem> itemcard) {
        if(itemcard.isEmpty()) {
            System.out.println("There is not item ");
            return;
        }
        double Totalbill = 0 ;
        for ( productItem item : itemcard ) {
            System.out.println(item);
            Totalbill += item.getPrice()* item.getQuantity()  ;
        }
        System.out.println("Total Amount of the bill " + Totalbill );
    }
}


