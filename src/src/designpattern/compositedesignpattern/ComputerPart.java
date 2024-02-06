package designpattern.compositedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class ComputerPart {


    interface Component{
        void showPrice();
    }



    static class Leaf implements Component{
        public Leaf(int price, String name) {
            this.price = price;
            this.name = name;
        }

        int price;
        String name;

        @Override
        public void showPrice() {

            System.out.println(name+" :   "+price);

        }
    }



    static class Composite implements Component{

        String name;

        public Composite(String name) {
            this.name = name;
        }

        // one composite element contains multiple components
        List<Component> components= new ArrayList<>();

        public void addComponent( Component comp){
            components.add(comp);
        }

        @Override
        public void showPrice() {
            System.out.println(name);
            for(Component c: components){

                //When showPrice() is called on a Leaf object, it executes the implementation provided in the Leaf class.
                // Similarly, when showPrice() is called on a Composite object, it executes the implementation provided in
                // the Composite class.

                //In the Composite class, when showPrice() is called, it iterates through its components and calls
                // showPrice() on each one. If the component is a Leaf, it will execute the showPrice() method defined in
                // the Leaf class.
                c.showPrice();
            }

        }
    }
}
