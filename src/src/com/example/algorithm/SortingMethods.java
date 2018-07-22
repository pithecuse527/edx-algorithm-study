package src.com.example.algorithm;

import java.util.Arrays;

public class SortingMethods {

    static void swap(int[] lst, int what, int where){

        // swaping methods, from what to where.
        int tmp = lst[where];
        lst[where] = lst[what];
        lst[what] = tmp;

    }

    static void selectionSort(int[] lst){

        int n = lst.length;

        // running indices
        int smallest, tmp, what = 0;

        // pick one as a smallest then compare with other elements.
        for (int i = 0; i < n; i++) {
            smallest = lst[i];
            for (int j = i; j < n; j++) {
                if (lst[j] < smallest) {
                    smallest = lst[j];
                    what = j;
                }
            }
            swap(lst, what, i);
            System.out.println((i+1) + ". is " + Arrays.toString(lst));
        }
    }

    static void bubbleSort(int[] lst){

        int n = lst.length;
        int j = 0;

        boolean swapped;

        // if swapped is TRUE, continue to compare with next element.
        do{
            swapped = false;
            for(int i=0; i < n-1; i++){
                if(lst[i] > lst[i+1]){
                    swap(lst, i, i+1);
                    swapped = true;
                }
            }
            System.out.println((++j) + ". is " + Arrays.toString(lst));
        } while(swapped);

    }

}
