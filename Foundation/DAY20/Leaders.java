package DAY20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Leaders {
    public static void findLeadersFromRight(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max=arr[n-1],i=n-2;
        ans.add(max);
        while (i>=0) {
            if (arr[i]>max) {
                ans.add(arr[i]);
                max=arr[i];
            }
            i--;
        }
        Collections.reverse(ans);
        System.out.println("Leaders in Array:"+ans);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };

        int n = arr.length;

        System.out.println("\nOriginal Array:");
        printArray(arr);

        findLeadersFromRight(arr, n);
    }
}
