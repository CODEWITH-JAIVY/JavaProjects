package com.librarymanagement;

public class LibraryItem {
    protected String itemid;
    protected String Title;
//    protected boolean isAvailabe;
int numberOfCopies =  0  ;
    LibraryItem(String itemid, String Title,  int numberOfCopies ) {
//        this.isAvailabe = true;
        this.itemid = itemid;
        this.Title = Title;
        this.numberOfCopies =numberOfCopies  ;
    }
    // in the library there is two method return or borrow item
     public String getItemid () {
        return  itemid  ;
     }

    public String getTitle() {
        return Title;
    }


      // borrow item method
    public void borrow() {
//        if (isAvailabe) {
//            System.out.println(" Borrow successful ");
//            isAvailabe = false  ;
//        }else {
//            System.out.println("Item is not avaiable now ");
//        }
        if( numberOfCopies  > 0 ) {
            numberOfCopies --  ;
            System.out.println("Borrow items is successfully  ");
        }
    }
    // return item
    public  void returnitem () {
       numberOfCopies++  ;
        System.out.println("Return successfully ");
    }

    public  void showDetail () {
        System.out.println("Item id " + itemid +  " \n Title :- " + Title   ) ;
    }
}
