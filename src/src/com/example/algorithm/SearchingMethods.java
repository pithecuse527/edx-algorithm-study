package src.com.example.algorithm;

public class SearchingMethods {

    static void linearSearch(int[] lst, int value){

        int n = lst.length;

        // search all elements in the array while finds the value.
        for(int i=0; i < n; i++){
            if (value == lst[i]){
                System.out.println("Found it! It is at " + i);
                return;
            }
        }

        // if there is no value that we want, this will be implemented.
        System.out.println("Not found.");

    }

    static int compare(int a, int b){

        if (a < b) return -1;
        else if (a == b) return 0;
        else return 1;

    }

    static void binarySearch(int[] lst, int val, int left, int right){

        // Left will be bigger than right if there is no value in the array.
        if (left > right) {
            System.out.println("The value is not in the array.");
            return;
        }

        System.out.println("1");

        int mid = (left + right) / 2;

        switch (compare(val, lst[mid])){

            // if value is lower than middle.
            case -1 : binarySearch(lst, val, left, mid - 1);
                      break;

            // if value is equal to middle.
            case 0 : System.out.println("Found it. It's in " + mid);
                      break;

            // if value is bigger than middle.
            case 1 : binarySearch(lst, val, mid + 1, right);
                      break;

        }

    }

}
