package DAY14;

import java.util.*;

public class intersection {

    public static void intersectionOfArray(int[] arr1, int[] arr2, int m, int n) {
        int i = 0, j = 0;
        List<Integer> inter = new ArrayList<>();

        while (i < m && j < n) {
            if (arr1[i] == arr2[j]) {
                if (inter.isEmpty() || inter.get(inter.size() - 1) != arr1[i]) {
                    inter.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println(inter);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int m = arr1.length;
        int arr2[] = { 2, 3, 3, 5, 6, 6, 7 };
        int n = arr2.length;

        System.out.println("\nArray 1:");
        printArray(arr1);
        System.out.println("\nArray 2:");
        printArray(arr2);

        System.out.println("\nIntersection of Array:");
        intersectionOfArray(arr1, arr2, m, n);
    }
}
