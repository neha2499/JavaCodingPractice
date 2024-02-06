package designpattern.buiddesignpattern;

public class ShopMain {

    public static void main(String[] args) {


//        Phone p =new Phone("Android",2, "Qualcomm",5.5,3100 );

//        //if you look into the instance you are passing 5 parameter to the constructor and sometimes it become
//        // difficult to maintain the order of the object and sometimes we don't want all the parameter to specify
//        // then builder design pattern come into picture.
//        System.out.println(p);


        Phone p = new PhoneBuilder().setOs("IOS").setRam(2).getPhone();
        System.out.println(p);

        // using PhoneBuilder instance you can create the variable p of type phone with taking care of all the parameters
        // and the order of the parameter as well.
    }

    }

