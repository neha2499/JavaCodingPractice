package functionalProgramming.functionalinterface;

import java.util.function.Consumer;
import java.util.function.BiConsumer;

public class _Consumer {
    public static void main(String[] args) {

     Customer consumer = new Customer("Neha", 6666666);

     greetConsumer(consumer);

     ///************************************************///
      // using functional interface

        //using Consumer interface
        greetCustomerConsumer.accept(consumer);

        //using BiConsumer interface
        greetCustomerConsumerV.accept(consumer,false);


    }

     //Regular Java Function
    static void greetConsumer(Customer greet){

        System.out.println("Hello "+greet.name+" your phone number is "+greet.phoneNumber);




    }

    //Using Consumer functional interface
    static Consumer<Customer> greetCustomerConsumer = customer ->  System.out.println("Hello "+customer.name+" your phone number is "+customer.phoneNumber);

    //Consumer<T> :: Represents a operation that accepts a single input argument and returns no results



    //*********************************************//

    //Using BiConsumer functional interface
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV = (customer, showPhonenumber) ->
            System.out.println("Hello "+customer.name+" your phone number is "+(showPhonenumber ? customer.phoneNumber : "************"));


    static class Customer{

        private String name;
        private Integer phoneNumber;



        public Customer(String name, Integer phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(Integer phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }
}
