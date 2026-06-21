package DAY11;

import java.util.*;

public class LargestElement {

    

    public static void largestElement(int[] arr, int n) {
        if(n==1) return;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array is:" + max);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


   
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 7, 5 };
        int n = arr.length;

        // System.out.println("\nOriginal Array:");
        // printArray(arr);

        // largestElement(arr, n);

        // smallerLargestAndSmallerElement(arr, n);
       

    }
}
