package src.com.example.algorithm;

public class MergeSorting {

    public static int[] mergeSort(int[] lst) {

        int n = lst.length;

        // if n is 1, just return it.
        if (n == 1) return lst;

        int[] left;
        int[] right;

        // create space for left and right subarrays
        if (n % 2 == 0) {
            left = new int[n / 2];
            right = new int[n / 2];
        } else {
            left = new int[n / 2];
            right = new int[n / 2 + 1];
        }

        // fill up left and right subarrays
        for (int i = 0; i < n; i++) {
            if (i < n / 2)
                left[i] = lst[i];
            else
                right[i - n / 2] = lst[i];
        }

        // recursively split and merge
        left = mergeSort(left);
        right = mergeSort(right);

        // merge
        return merge(left, right);
    }

    // the function for merging two sorted arrays
    public static int[] merge(int[] left, int[] right) {

        // create space for the merged array
        int[] result = new int[left.length + right.length];

        // running indices
        int i = 0, j = 0, index = 0;
        //int count = 0;

        // add until one subarray is deplete
        while (i < left.length && j < right.length){
            if (left[i] < right[j])
                result[index++] = left[i++];
            else
                result[index++] = right[j++];
            //count++;
        }

        // add every leftover elelment from the subarray
        // only one of these two while loops will be executed
        while (i < left.length)
            result[index++] = left[i++];

        while (j < right.length)
            result[index++] = right[j++];

        //System.out.println("!!"+count+"!!");
        return result;

    }

}

