package sort;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] array1, int[] array2){

        int[] combined = new int[array1.length+array2.length];
        int index=0;
        int i=0;
        int j=0;

        while (i<array1.length && j<array2.length){ // this loop will run till both arrays have value

            if(array1[i]<array2[j]){
                combined[index]=array1[i];
                i++;
                index++;
            } else {
                combined[index] =array2[j];
                index++;
                j++;
            }

        }

        while (i<array1.length){//array1 has element

            combined[index]=array1[i];
            index++;
            i++;

        }
        while (j<array2.length){//array2 has element

            combined[index]=array2[j];
            index++;
            j++;

        }

        return combined;
    }

    public static int[] mergeSort(int[] array){
        // we will divide the array into two halves and then apply merge method, but merge method can be aaplicable
        //to two sorted algorithm, for that point we keep on dividing the array till they become single element because
        // single element array is indeed sorted and
        //apply mergeSort method on it.

        if(array.length==1) return array;
        int midIndex= array.length/2;
        int[] left= mergeSort(Arrays.copyOfRange(array, 0, midIndex)); // copy before index
        int[] right= mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(left,right);



    }
}
