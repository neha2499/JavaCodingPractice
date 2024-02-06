package designpattern.Observerdesignpattern;

public class YouTube {


    public static void main(String[] args) {


        Channel tulesko = new Channel();

        Subscriber s1= new Subscriber("neha");
        Subscriber s2= new Subscriber("Jaskaran");
        Subscriber s3= new Subscriber("Garima");
        Subscriber s4= new Subscriber("Rinni");

        tulesko.subscribe(s1);
        tulesko.subscribe(s2);
        tulesko.subscribe(s3);
        tulesko.subscribe(s4);



        s1.subscribeChannel(tulesko);
        s2.subscribeChannel(tulesko);
        s3.subscribeChannel(tulesko);
        s4.subscribeChannel(tulesko);


      tulesko.uplaod("how to learn development");


    }
}
