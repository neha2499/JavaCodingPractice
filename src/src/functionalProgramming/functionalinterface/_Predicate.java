package functionalProgramming.functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println( isValid("+1123356784"));

        //using predicate
        System.out.println(isValidV1.test("+1123356784"));

    //Combining the two predicate
           // using the and operator
        System.out.println(isValidV1.and(getIsValidV2).test("+1124456784"));

           //using OR operator
        System.out.println(isValidV1.or(getIsValidV2).test("+1124456784"));
    }

    //Regular JAVA function
    static boolean isValid(String phoneNumber){
        return phoneNumber.startsWith("+1") && phoneNumber.length()==11;
    }

    //using functional interface

    static Predicate<String> isValidV1= phoneNumber ->phoneNumber.startsWith("+1") && phoneNumber.length()==11;

    static Predicate<String> getIsValidV2 = phoneNumber -> phoneNumber.contains("3");
}
