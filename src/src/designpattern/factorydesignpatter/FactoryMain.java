package designpattern.factorydesignpatter;

public class FactoryMain {

    public static void main(String[] args) {
//    <https://www.baeldung.com/java-factory-pattern>
//   we are providing the implementation directly over here and if we want to change the implementation from Android
//   to Windows or IOS you have to change the code that means your client which type of class you are working with
//
//        OS obj= new Android();
//        obj.specs();



        //instead of creating the new instance of the classes in the main method we will create the instance in the
        //OperatingSystemFactory class to have the loose coupling of the instances with the main method.

        OperatingSystemFactory operatingSystemFactory= new OperatingSystemFactory();
        operatingSystemFactory.getInstance("Open");

        // from the above code you cant predict which instance out of Android, IOS, Windows, you are calling thus make
        // the loose coupling.
    }
}
