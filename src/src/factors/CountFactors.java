package factors;

public class CountFactors {


    public static int gcd(int a , int b){

        if (a==0) return b;

        return gcd(b%a,a);


    }

    public static void countDivisor(int a, int b){
        //Yes, the common factors of two numbers are also factors of their greatest common divisor (GCD).
        int n= gcd(a,b);

        int results=0;
        for (int i=1; i<=Math.sqrt(n);i++){
//         Divisor means it leaves the remainder to be 0
//            This part counts the divisors found. If i is a divisor and n / i equals i, it means i is a perfect square
//            divisor of n (as it divides n and the quotient is the same). In this case, result is increased by 1 as only
//                one divisor is counted (not a pair). If they are not equal, then both i and n / i are different, hence
//                increasing the result by 2, accounting for the two divisors (a pair).
            if(n%i==0){
                if(n/i==i){ results+=1;}
                results+=2;
            }


        }
        System.out.println(results);
    }


    public static void main(String[] args) {
        int a = 12;
        int b= 24;
        countDivisor(a,b);
    }
}
//         Let's take the number n = 100 as an example.
//
//         The divisors of 100 are the numbers that can be multiplied to get 100 as a result.
//
//         The divisors occur in pairs. If i is a divisor of n, then n / i is also a divisor of n.
//         For instance, if i = 5 is a divisor of n = 100, then n / i = 100 / 5 = 20, and 20 is also a divisor of n = 100.
//
//
//         Here's the breakdown:
//
//         For n = 100:
//
//         Divisors include 1, 2, 4, 5, 10, 20, 25, 50, 100.
//         Pairing of divisors:
//
//         If we start checking divisors from 1 up to the square root of n (in this case, 10), we will find pairs of divisors.
//         For example, when i = 5 (which is less than or equal to the square root of 100), n / i is also a divisor:
//         i = 5 is a divisor, and n / i = 100 / 5 = 20 is also a divisor.
//         Similarly, for i = 10, n / i = 100 / 10 = 10 is also a divisor.
//         By looping only up to the square root of n,
//         you're effectively capturing all divisors in pairs efficiently. Any further divisors will simply mirror the pairs
//         that you've already counted, making it unnecessary to search beyond the square root. This is why divisors are always
//         found in pairs, and iterating up to the square root helps cover both divisors of each pair efficiently.