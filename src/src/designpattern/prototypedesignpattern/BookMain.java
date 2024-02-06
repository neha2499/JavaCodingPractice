package designpattern.prototypedesignpattern;



public class BookMain {

    public static void main(String[] args) throws CloneNotSupportedException {


        BookShop bookShop= new BookShop();
        bookShop.setShopName("Novelty");
        bookShop.loadData();
        System.out.println(bookShop );


//        BookShop bookShop1= (BookShop) bookShop.clone();
//        bookShop1.setShopName("Arcadia");
//       // bookShop1.loadData(); the moment you call the method loadData() it will go back to database and fetch data from there but we want to copy the
//        //content of bookShop directly
//         bookShop.getBooks().remove(2);
//        System.out.println("changed data of novelty"+bookShop);
//        System.out.println(bookShop1);



// the above code will make novelty and arcadia the mirror image of each other , the changes made in novelty will also be
        // reflected in arcadia

// we need to change the default overriding the clone method
        BookShop bookShop1=  bookShop.clone();
       bookShop1.setShopName("Arcadia");
        bookShop.getBooks().remove(2);
      System.out.println("changed data of novelty"+bookShop);
        System.out.println(bookShop1);


        //in the above code changes made in bookshop is not effecting the data of bookshop1

    }
}
