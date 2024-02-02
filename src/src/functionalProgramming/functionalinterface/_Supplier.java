package functionalProgramming.functionalinterface;


import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getName());

        //using functional Interface
        System.out.println(getNameV.get());
    }


    static String getName(){
        return "Neha Chaudhary";
    }

    //using functional interface

    static Supplier<String> getNameV=()-> "Jaskaran Singh";
}
