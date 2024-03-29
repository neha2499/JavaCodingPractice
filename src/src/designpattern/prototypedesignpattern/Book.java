package designpattern.prototypedesignpattern;

public class Book {

    public Book(int bid, String bname) {
        super();
        this.bid = bid;
        this.bname = bname;
    }

    private int bid;
    private String bname;



    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                '}';
    }
}
