public class Binary {

    public void convertToHexadecimal(long binary1){
//        System.out.println("binary: "+binary1);
//        long n=binary1;
//        int i = 0;
//        int Decimal=0;
//        while(n>0){
//            System.out.println("n: "+n);
//            Decimal += (n%10)*Math.pow(2,i++);
//            System.out.println("Decimal: "+Decimal);
//            n=n/10;
//
//
//        }
//        System.out.println(Decimal);
        System.out.println(Integer.toHexString((int) binary1).toUpperCase());






    }
    public static void main(String[] args) {
    Binary binary= new Binary();
    binary.convertToHexadecimal(0b01011011);
    }
    }
