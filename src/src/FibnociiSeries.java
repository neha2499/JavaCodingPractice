public class FibnociiSeries {

    public void fib(){

        int a =0;
        int b= 1;
        int length=10;
        int c;
        System.out.print(a+" "+b);
        for(int i=2; i<length; i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }

    }
}
