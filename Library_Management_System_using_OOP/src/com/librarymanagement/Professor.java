package com.librarymanagement;

public  class Professor extends  UserClass {
    //String name , String userId  , int maxItem (there is only three instrant only which is extentd by super class
    Professor( String name , String userId , int maxintem    ) {
        super(name , userId , maxintem );
    }
    // override the retrurn and borrow item
    // in the case professor can only magazine  , professor  don't allow to borrow book

    @Override
    public void  borrow (LibraryItem item) {
        if( item instanceof  Magazine ) {
            super.borrow(item);
        }else {
            System.out.println("Only professor can borrow ");
        }
    }

//   @Override
//    public void returnMethod()
//    {
//       super.returnMethod( );
//    }
}
