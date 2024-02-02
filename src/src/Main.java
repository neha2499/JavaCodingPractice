import sort.BubbleSort;
import sort.InsertionSort;
import sort.MergeSort;
import sort.SelectionSort;
import tree.BST;
import tree.rBST;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Palindrome pal= new Palindrome();
        //pal.palindrome();

        Anagrams ana= new Anagrams();
        //System.out.println(ana.anagrams());
        VowelsConsonants vowelsConsonants= new VowelsConsonants();
       // vowelsConsonants.countVC();

        ReverseArray reverseArray= new ReverseArray();
        //reverseArray.reverse();
        FibnociiSeries fibnociiSeries=new FibnociiSeries();
        //fibnociiSeries.fib();
        Armstrong armstrong =new Armstrong();
       // armstrong.arms();
        Factorial factorial= new Factorial();
        //System.out.println(factorial.fact(4));


        BST bst=new BST();
       // System.out.println(bst.insert(4));
//        //System.out.println(bst.contains(3));
//        bst.insert(47);
//        bst.insert(21);
//        bst.insert(27);
//        bst.insert(18);
//        bst.insert(76);
//        bst.insert(52);
//        bst.insert(82);
//        //bst.breadthFirstSearch();
//        System.out.println(bst.BFSPreOrder());
//        //System.out.println(bst.DFSPostOrder());

        rBST rbst=new rBST();
//        rbst.rInsert(5);
//        rbst.rInsert(6);
//        rbst.rInsert(7);
//        System.out.println(rbst.getRoot().value);
//        System.out.println(rbst.rContains(5));

        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
//        BubbleSort bubbleSort=new BubbleSort();
//        bubbleSort.sort(arr);

//        SelectionSort selectionSort= new SelectionSort();
//        //selectionSort.sort(arr);
//        InsertionSort insertionSort=new InsertionSort();
//        insertionSort.sort(arr);
        MergeSort Sort= new MergeSort();
        int[] s= Sort.mergeSort(arr);
        System.out.println(Arrays.toString(s));
    }



}