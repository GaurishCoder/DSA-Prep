package DAY20;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsectiveLength {

    // TC:O(n) and SC:O(n)
    public static void findLongestConsectiveNumbersLengthOptimal(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : arr) {
            set.add(i);
        }
        int len=1;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i] - 1)) {
                int currCount = 1;
                int elem = arr[i] ;
                while (set.contains(elem+1)) {
                    currCount++;
                    elem++;
                }
                len = Math.max(len, currCount);
            }
        }
        System.out.println("Longest Consective Numbers Length:" + len);
    }

    // TC:O(n^2) and SC:O(1)
    public static void findLongestConsectiveNumbersLength(int[] arr, int n) {
        Arrays.sort(arr);
        int len = 1, currCount = 0, lastSmaller = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - 1) == lastSmaller) {
                currCount++;
                lastSmaller = arr[i];
            } else if (arr[i] != lastSmaller) {
                currCount = 1;
                lastSmaller = arr[i];
            }
            len = Math.max(len, currCount);
        }
        System.out.println("Longest Consective Numbers Length:" + len);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };

        int n = arr.length;

        System.out.println("\nOriginal Array:");
        printArray(arr);

        findLongestConsectiveNumbersLengthOptimal(arr, n);
    }
}
