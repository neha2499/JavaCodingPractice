public class Armstrong {

    public void arms(){
        int i;
        int b=0;
        int n= 1634;
        int reducedNumber=n;
        int degree=  String.valueOf(n).length();

        while(reducedNumber>0){

            i = reducedNumber%10;
            b= (int) (Math.pow(i,degree)+b);
            reducedNumber=reducedNumber/10;

        }


        if(n==b){
            System.out.println("it is a armstrong number");

        }else {
            System.out.println("not a arm strong number ");
        }

    }
}
