package functionalProgramming.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {


        int increment = incrementByOneFunction.apply(1);
        System.out.println(increment);

 //******************************************************************************

        // .andThen function is used to combine two function
        Function<Integer, Integer> IncrementThenMultiply =
                incrementByOneFunction.andThen(multiplyBy10);

        System.out.println(IncrementThenMultiply.apply(1));
//*********************************************************************************//


        //Bi-function that takes two argument
         int increment1= incrementAndMultiply(1,5);
        System.out.println("Bi-function"+increment1);


    }

    //Function<T,R> :: Represents a function that accepts one argument and produces a result
    //T:: parameter datatype and R::return datatype
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyBy10 =
            number -> number * 10;
    //*************************************************************************//

    //Regular Method//
    static int incrementAndMultiply(int num, int multiply) {
        return (num + 1) * multiply;
    }

    //functional programming method using BiFunction method that two values as a parameter//
   static BiFunction<Integer, Integer, Integer> incrementByOneAndMUltiplyBifunction =
            (num, multiply)
                    -> (num + 1) * multiply;
}