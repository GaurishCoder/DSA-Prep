package DAY11;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargestSmallest {

    public static int secondLargest(int[] arr, int n) {
        int max = arr[0], smax = Integer.MIN_VALUE; // 1, 2, 4, 7, 7, 5
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                smax = max;
                max = arr[i];
            } else if (smax < arr[i] && max != arr[i]) {
                smax = arr[i];
            }
        }
        return smax;
    }

    public static int secondSmallest(int[] arr, int n) {
        int min = arr[0], smin = Integer.MAX_VALUE; // 10, 2, 4, 7, 7, 1
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                smin = min;
                min = arr[i];
            } else if (smin > arr[i] && min != arr[i]) {
                smin = arr[i];
            }
        }
        return smin;
    }

    // optimize approach
    public static void optimizeCode(int[] arr, int n) {
        int secondLargest = secondLargest(arr, n);
        int secondSmallest = secondSmallest(arr, n);
        System.out.println("Second Largest Element:" + secondLargest);
        System.out.println("Second Smallest Element:" + secondSmallest);
    }

    // brute force approach
    public static void smallerLargestAndSmallerElement(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int var : arr) {
            list.add(var);
        }
        Collections.sort(list);

        int smin = 0, smax = 0;
        int min = list.get(0), max = list.get(n - 1);
        int i = n - 1;

        // second largest
        while (max == list.get(i)) {
            i--;
        }
        if (max > list.get(i)) {
            smax = list.get(i);
        } else {
            smax = -1;
        }
        System.out.println("second largest element:" + smax);

        // second smallest
        int j = 0;
        while (min == list.get(j)) {
            j++;
        }
        if (min < list.get(j)) {
            smin = list.get(j);

        } else {
            smin = -1;
        }
        System.out.println("second smallest element:" + smin);
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

        System.out.println("\nOriginal Array:");
        printArray(arr);

        optimizeCode(arr, n); // smax = 5 smin = 2

    }
}
