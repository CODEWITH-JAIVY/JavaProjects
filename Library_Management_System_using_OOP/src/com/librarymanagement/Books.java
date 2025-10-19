package com.librarymanagement;

public class Books extends  LibraryItem  {
    // LibraryItem(String itemid, String Title, boolean isAvailabe)
    protected  String Bookname  ;
    protected  AuthorName   authorName  ;

    Books ( String itemid , String Title ,int numberOfCopies  , String Bookname , AuthorName  authorName  ) {
        super(itemid, Title, numberOfCopies );
        this.Bookname = Bookname;
        this.authorName = authorName ;

    }


    public  void  setBookname(String bookname ) {
        this.Bookname  = bookname  ;
    }
    public  String getBookname  ( ) {
        return  Bookname  ;
    }

   // override the method of the libraryitem showdetail function to  display the book availibity
    @Override
    public  void showDetail () {
        System.out.println("Item id " + itemid +  " \n Title :- " + Title   +  "\n BookName "+getBookname() + "\n author detail  " ) ;
        authorName.showAuthorDetail();
    }
}
