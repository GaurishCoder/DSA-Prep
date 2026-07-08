package DAY26;

import java.util.*;

public class LengthOfSubarray {

    public static void findMaxLengthOfSubarray(int[] arr) {
        int maxLen=0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0,count=0;
            for (int j = i; j < arr.length; j++) {
                count++;
                sum+=arr[j];
                if (sum==0) {
                    maxLen = Math.max(maxLen, count);
                }
            }
        }
        System.out.println("Maximum length of Subarray with zero sum:"+maxLen);
    }
    

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {6, -2, 2, -8, 1, 7, 4, -10};
        int n = arr.length;
        System.out.println("\nOriginal Array:");
        printArray(arr);

        findMaxLengthOfSubarray(arr);
    }
}
