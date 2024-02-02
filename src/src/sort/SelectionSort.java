package sort;

import java.util.Arrays;

public class SelectionSort {

//    The algorithm repeatedly selects the smallest (or largest) element from the unsorted portion of the list and
//    \swaps it with the first element of the unsorted part. This process is repeated for the remaining unsorted
//    portion until the entire list is sorted.

    //The space complexity of the selection sort algorithm is:
    //
    //An in-place algorithm is a selection sort algorithm.
    //It performs all computations in the original array and does not use any other arrays.
    //As a result, the space complexity is O. (1).

    //It has an O (n2) time complexity due to the two nested loops

 public void sort(int[] arr){


     for(int i=0; i< arr.length;i++){
         int minIndex = i;
         for (int j=i+1; j< arr.length;j++){
            if(arr[j]<arr[minIndex]){
             minIndex=j;
         }


         }
         if(i != minIndex) {
             int temp = arr[i];
             arr[i] = arr[minIndex];
             arr[minIndex] = temp;
         }

     }

     System.out.println(Arrays.toString(arr));


 }



}
