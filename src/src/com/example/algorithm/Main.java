package src.com.example.algorithm;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] lst = {1,6,12,13,20,24,30,33,39,42,50};

        //SortingMethods.selectionSort(lst);
        //SortingMethods.bubbleSort(lst);
        //System.out.println(Arrays.toString(lst));

        //int[] lst2 = MergeSorting.mergeSort(lst);
        //System.out.println(Arrays.toString(lst2));

        SearchingMethods.binarySearch(lst, 42, 0, 6);

        //SearchingMethods.linearSearch(lst, 5);

    }
}
