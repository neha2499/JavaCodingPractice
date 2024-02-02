package sort;

import java.util.Arrays;

public class BubbleSort {

//    In this algorithm,
//    traverse from left and compare adjacent elements and the higher one is placed at right side.
//    In this way, the largest element is moved to the rightmost end at first.
//    This process is then continued to find the second largest and place it and so on until the data is sorted.
//    Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they
//    are in the wrong order. This algorithm is not suitable for large data sets as its average and worst-case time
//    complexity is quite high.


    //you can notice that there is no return that means that we are not making the copy of a sorted array.
    // In fact we are sorting the array in place so, space complexity of O(1).The Bubble Sort algorithm has a time complexity of O(N2).

 //At pass 1:
 //Number of comparisons = (N-1)
 //Number of swaps = (N-1)
 //
 //At pass 2:
 //Number of comparisons = (N-2)
 //Number of swaps = (N-2)
 //
 //At pass 3:
 //Number of comparisons = (N-3)
 //Number of swaps = (N-3)
 //.
 //.
 //.
//At pass N-1:
//Number of comparisons = 1
//Number of swaps = 1
//
//Now, calculating total number of comparison required to sort the array
//= (N-1) + (N-2) +  (N-3) + . . . 2 + 1
//= (N-1)*(N-1+1)/2  { by using sum of N natural Number formula }
//= (N * (N-1)) / 2
//
//In worst case, Total number of swaps = Total number of comparison
//Total number of comparison (Worst case) = N(N-1)/2
//Total number of swaps (Worst case) = N(N-1)/2
    public  void sort(int arr[]){

        for(int i=arr.length-1;i >0; i--){
   // we need to consider one less element for int i in order to prevent array out of bound exception
            for(int j=0; j< i; j++){

                if (arr[j]>arr[j+1]){
                    int temp;
                    temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
