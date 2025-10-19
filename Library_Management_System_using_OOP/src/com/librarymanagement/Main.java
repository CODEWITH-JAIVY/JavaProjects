package com.librarymanagement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AuthorName authorName  = new AuthorName("kethi  sarae " , " book name is java first head " ,  2 ) ;
      Books book1  = new Books( "java123" , "Mastring java " ,10  , " java " , authorName  )  ;
      // Student(String name , String  userId , int maxItem
     Student std = new Student( "Sanjeet kumar " , "jaivy123" , 1 ) ;

//      std.showDetailuser();
      newOperationalLibarary libarary  = new newOperationalLibarary() ;
      // adding user
//      libarary.addUser(); // adds a default student
      libarary.addUser("Sanjeet kumar");
      libarary.addUser("jaivy roy ");// adds student with given name
//      libarary.addUser(new Professor("Prof Roy", "P101", 10)); // adds professor



      libarary.AddBook(book1);
      // add another book
        AuthorName authorName1 = new AuthorName("jaivy roy " , " full strack developer " , 2 ) ;
        Books book2 = new Books(" fullStack Development " , "web devlop" , 10 , "fullstacl wiht java " , authorName1 ) ;
        libarary.AddBook(book2 );
        libarary.RemoveBooks("java123" );
        libarary.Showdetail() ;

        //adding the magazine items

        System.out.println("********************************************************");
        System.out.println("_________________________________________________________");
        System.out.println("Magazine operatoin from there ");
        Magazine magazine  = new Magazine( "time of india " , "time of india123" , "magazine123" ," time of india  ki aawaj  " , 10 ) ;
        Professor pfs = new Professor(" Mr.  sanjeet kumar ", "sanjeet 123580", 1) ;
//        {
//          @Override
//      public void returnMethod(LibraryItem item) {
//
//      }
//    };
//        pfs.borrow(magazine);
        pfs.showDetailuser();

        Operationformagazine  libraryMagazine = new Operationformagazine() ;
        Magazine magazine1 = new Magazine("dil ki aawaj  " , "dil ki aawaj series 1 " ,"dilkiaawaj1235880" , "mohhabtr -e -eshk" , 10 ) ;
        libraryMagazine.AddMagazine(magazine1);
        libraryMagazine.ShowMagazineDetail();
    }
}