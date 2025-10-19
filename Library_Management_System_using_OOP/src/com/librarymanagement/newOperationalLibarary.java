package com.librarymanagement;

import java.util.ArrayList;

public class newOperationalLibarary implements  BookOperation {
    //    Books [] book = new Books[10] ;
//    int CountBook = 0  ;
    // adding book
    ArrayList<LibraryItem> items = new ArrayList<>();
    ArrayList<UserClass> Users = new ArrayList<>();

    @Override
    public void AddBook(Books books) {

//        if ( CountBook < book.length  ) {
//            book[CountBook++] = books ;
//            System.out.println("Booked added succussfully ");
//        }else{
//            System.out.println("Book is not added ");
//        }
        items.add(books);
        System.out.println("Books  added successfully ");

        System.out.println("After adding  the book remain books is " + items.getFirst().numberOfCopies);
    }

    @Override
    public void RemoveBooks(String itemid) {
//        boolean found = false   ;
//        for (int i = 0; i < book.length ; i++) {
//            if(book[i].getItemid() .equals(itemid ) ) {
//                book[i] = book[--CountBook];
//                book[CountBook] = null;  // clear the last position
//                System.out.println("Book with item id " + itemid + " Has been removed seccesfully ");
//                found  = true ;
//                break;
//            }
//        }
//        if ( ! found  ) {
//            System.out.println("Book is not found  ");
//        }
        boolean found = false;
        for (LibraryItem item : items) {
            if (item.getItemid().equals(itemid)) {
                items.remove(item);
                System.out.println("Books  with item id " + itemid + " succefully ");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found ! ");
        }
        System.out.println("After removeing the book remain books is " + items.getFirst().numberOfCopies);
    }

    @Override
    public void Showdetail() {
//   for (int i  = 0  ; i< CountBook  ;  i ++ ) {
//       System.out.println( "book name  :-   " + book[i] .getItemid()   + "\n book author name  " + book[i].authorName .getAuthorName() );
//   }
        if (items.isEmpty()) {
            System.out.println("No books in the library ");
            return;
        }
        System.out.println("Library Item ");
        for (LibraryItem item : items) {
            System.out.println("Book id " + items.getFirst().getItemid());
            Books books = (Books) item;
            if (item instanceof Books) {
                System.out.println("Books name " + ((Books) item).getBookname());
                System.out.println("Books author " + ((Books) item).authorName);
            }

        }
        System.out.println("--------------------");
    }

    // adding user and removing users

    // adding user and removing users
    public void addUser(UserClass user) {
        if (user == null) {
            System.out.println("Cannot add null user!");
            return;
        }
        Users.add(user);
        System.out.println("User added successfully: " + user.getClass().getSimpleName() + " -> " + user);
    }

    // Overloaded: add user by name (default Student)
    public void addUser(String name) {
        Student std = new Student(name, "U" + (Users.size() + 1), 5);
        Users.add(std);
        System.out.println("User added successfully (Student): " + name);
    }

    // Overloaded: no-arg → adds a default student
    public void addUser() {
        Student std = new Student("Default Student", "U" + (Users.size() + 1), 5);
        Users.add(std);
        System.out.println("Default Student added successfully.");
    }

    public void removeUUser(UserClass user) {
        if (Users.remove(user)) {
            System.out.println("User removed successfully: " + user.getClass().getSimpleName() + " -> " + user);
        } else {
            System.out.println("User not found: " + user);
        }
    }

}
