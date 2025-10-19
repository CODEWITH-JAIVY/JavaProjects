package com.librarymanagement;

public  class Student extends UserClass {
    private static final int MAX_BOOK_ALLOCATED = 5;
    private int booksBorrowed = 0;

    Student(String name, String userId, int maxItem) {
        super(name, userId, maxItem);
    }

    // Student can borrow and return items
    @Override
    public void borrow(LibraryItem item) {
        // Only allow Books
        if (!(item instanceof Books)) {
            System.out.println("Students can only borrow Books!");
            return;
        }

        // Check max book allocation
        if (booksBorrowed >= MAX_BOOK_ALLOCATED) {
            System.out.println("Student can borrow only up to " + MAX_BOOK_ALLOCATED + " books.");
            return;
        }

        // Check availability
        if (item.numberOfCopies <= 0) {
            System.out.println("This book is not available right now.");
            return;
        }

        // Borrow the book
        super.borrow(item);
        item.numberOfCopies--;
        booksBorrowed++;
        System.out.println("Book borrowed successfully! Total borrowed: " + booksBorrowed);
    }

//    @Override
//    public void returnMethod (LibraryItem item) {
//        // Student should return a Book only
//        if (!(item instanceof Books)) {
//            System.out.println("Students can only return Books!");
//            return;
//        }
//
//        if (booksBorrowed <= 0) {
//            System.out.println("No borrowed books to return.");
//            return;
//        }
//
//        // Return book
//        super.returnMethod();
//        item.numberOfCopies++;
//        booksBorrowed--;
//        System.out.println("Book returned successfully! Remaining borrowed: " + booksBorrowed);
//    }
}
