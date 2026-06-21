package DAY12;

import java.util.HashMap;
import java.util.HashSet;

public class removeDuplicateElem {

    public static void removeDuplicate(int[] arr, int n) {
        int idx = 0, k = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[idx] != arr[i]) {
                arr[k++] = arr[i];
                idx = i;
            }
        }
    }

    public static void bruteForce(int[] arr, int n) {
        // int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int i = 0;
        for (int j : map.keySet()) {
            arr[i] = j;
            i++;
        }

    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        int n = arr.length;

        System.out.println("\nOriginal Array:");
        printArray(arr);

        bruteForce(arr, n);
        // removeDuplicate(arr, n);
        System.out.println("\nAfter Removing Duplicate:");
        printArray(arr);

    }
}
