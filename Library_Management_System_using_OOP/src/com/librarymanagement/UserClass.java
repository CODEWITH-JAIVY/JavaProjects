package com.librarymanagement;

public  class UserClass {


    protected String name;
    protected String userId;
    protected int maxItem;   // Maximum items a user can borrow
    protected int itemsBorrowed;

    public UserClass(String name, String userId, int maxItem) {
        this.name = name;
        this.userId = userId;
        this.maxItem = maxItem;
        this.itemsBorrowed = 0;
    }

    // Borrow method (default behavior, can be overridden by subclasses)
    public void borrow(LibraryItem item) {
        if (itemsBorrowed >= maxItem) {
            System.out.println(name + " has reached the borrowing limit!");
            return;
        }

        if (item.numberOfCopies > 0) {
            itemsBorrowed++;
            item.numberOfCopies--;
            System.out.println(name + " borrowed: " + item.getTitle());
        } else {
            System.out.println(item.getTitle() + " is not available!");
        }
    }

    // Abstract return method (must be defined by subclasses)
   // public abstract void returnMethod(LibraryItem item);

    // Show user details
    public void showDetailuser() {
        System.out.println("User Name: " + name);
        System.out.println("User ID: " + userId);
        System.out.println("Items Borrowed: " + itemsBorrowed + "/" + maxItem);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", maxItem=" + maxItem +
                ", itemsBorrowed=" + itemsBorrowed +
                '}';
    }

  //  public abstract void returnMethod();
}
