package sort;

import java.util.Arrays;

public class InsertionSort {


    public void sort(int[] arr){

        for(int i=1; i< arr.length;i++){
            int temp = arr[i];

            int j=i-1;

            while(j>-1 &&temp<arr[j]){
                arr[j+1]= arr[j];
                arr[j]=temp;
                j--;

            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
