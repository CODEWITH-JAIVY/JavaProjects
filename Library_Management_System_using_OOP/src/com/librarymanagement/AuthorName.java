package com.librarymanagement;

public class AuthorName {
    private  String authorName  ;   //  only getter method
    private String Biography  ;  // setter and getter method
    private int  numberofPublished  ; // setter and getter method

    AuthorName ( String authorName , String Biography , int numberofPublished ) {
        this.authorName = authorName ;
        this.Biography  = Biography ;
        this.numberofPublished  = numberofPublished  ;
    }

    public  String returnAuthorDetail() {
        return  authorName + "\n " +  Biography +  "\n " + numberofPublished  ;
    }
    public  String getAuthorName ( ) {
        return  authorName ;
    }

    public String getBiography() {
        return Biography;
    }

    public void setBiography(String biography) {
        Biography = biography;
    }

    public int  getNumberofPublished() {
        return numberofPublished;
    }

    public void setNumberofPublished(int  numberofPublished) {
        this.numberofPublished = numberofPublished;
    }

    public  void showAuthorDetail () {
        System.out.println("AuthorName  :- " + getAuthorName()  + "\n BioGraphy  " + getBiography() + "\n Number of published books " + getNumberofPublished() );

    }
}
