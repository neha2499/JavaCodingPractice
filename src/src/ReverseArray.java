import java.util.Arrays;

public class ReverseArray {

    public void reverse(){

        int[] arr= {2,3,34,3,4};
        int n = arr.length;
        int[]b = new int[n];
        int j=n;
        for(int i=0; i< arr.length; i++){

                b[j-1]= arr[i];
                j--;


        }

        System.out.println("real array"+ Arrays.toString(arr));
        System.out.println("reversed array"+Arrays.toString(b));
    }
}
