package sort;

import java.util.Arrays;

public class QuickSort {

     public static void  swap(int[] array, int firstIndex, int secondIndex){
         int temp = array[firstIndex];
         array[firstIndex]=array[secondIndex];
         array[secondIndex]= temp;
     }

     public static int pivot(int[] array, int pivotIndex, int endIndex){
         int swapIndex= pivotIndex;

         for(int i= pivotIndex+1; i<=endIndex; i++){
// the change is greater than and less than the below f condition cause sorting to be in increasing or decreasing order.
             if(array[pivotIndex]>array[i]){
                 //swap index tbhi increment hoga agr uper vali condition puri hogi
                 swapIndex++;
                 swap(array,swapIndex,i);
             }
         }

         swap(array, pivotIndex,swapIndex);

         return swapIndex;
         //swapIndex ek index value(midPoint) jiske left ki saari values ussei less hogi and
         //right mei saari values usse badi hogi.

   }

   public static void quickSort(int[] arr, int leftIndex, int rightIndex){
         if(leftIndex<rightIndex){
             int pivotIndex= pivot(arr,leftIndex,rightIndex);
             quickSort(arr, leftIndex, pivotIndex-1);
             quickSort(arr,pivotIndex+1, rightIndex);
         }

   }

    public static void main(String[] args) {
        int[] arr= {4,6,1,7,3,2,5};
        System.out.println("before QuickSort"+ Arrays.toString(arr));
        quickSort(arr,0,6);
        System.out.println("After quicksort"+Arrays.toString(arr));

    }
}

