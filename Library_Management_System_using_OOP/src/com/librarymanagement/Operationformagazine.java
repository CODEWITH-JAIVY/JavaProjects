package com.librarymanagement;

public class Operationformagazine implements MagazineOperation {

    @Override
    public void AddMagazine(Magazine magazine ) {
        Magazine []magazinelist  = new Magazine[10] ;
        int magazineCount = 0  ;
        if(magazineCount < magazinelist.length ) {
      magazinelist[magazineCount++] = magazine  ;
            System.out.println("You have added successefully magazine ");
        }
        else {
            System.out.println(" Magazine library is full now  ");
        }
    }

    @Override
    public void RemoveMagazine(String itemid) {

    }

    @Override
    public void ShowMagazineDetail() {

    }
}
