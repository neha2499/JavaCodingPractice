package designpattern.Observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {


    List<Subscriber> subs= new ArrayList<>();
    private String title;

    public void subscribe (Subscriber subscriber){
        subs.add(subscriber);

    }


    public void unSubscribe(Subscriber subscriber){
        subs.remove(subscriber);

    }

    public void notifySubscriber(){

        for (Subscriber s: subs){
            s.update();
        }

    }


    public void uplaod(String title){
        this.title=title;
        notifySubscriber();

    }
}
