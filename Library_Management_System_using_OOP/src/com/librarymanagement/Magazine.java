package com.librarymanagement;

public class Magazine extends  LibraryItem  {
    protected String magazinename  ;
    protected  String magazineseries ;

    //LibraryItem(String itemid, String Title, boolean isAvailabe)
    Magazine( String magazinename , String magazineseries  , String itemid  , String Title ,  int numberOfcopies   ) {
        super( itemid, Title, numberOfcopies );
        this.magazinename  = magazinename  ;
        this.magazineseries  = magazineseries  ;
    }

    public String getMagazinename() {
        return magazinename;
    }

    public void setMagazinename(String magazinename) {
        this.magazinename = magazinename;
    }

    public String getMagazineseries() {
        return magazineseries;
    }

    public void setMagazineseries(String magazineseries) {
        this.magazineseries = magazineseries;
    }

    @Override
    public void showDetail() {
        super.showDetail();
        System.out.println("Magazine name :- " + getMagazinename()  + " \n MagazineSeries " + getMagazineseries() );
    }
}
