package DAY18;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class alternatingSign {
    public static void alternatingPostiveNegativeSign(int[] arr, int n) {
        int[] ans = new int[n];
        int pos=0,neg=1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                ans[pos]=arr[i];
                pos+=2;
            }else{
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        System.out.println("Alternating Positive and Negative Array:");
        printArray(ans);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,2,-3,-1,-2,-3};

        int n = arr.length;

        System.out.println("\nOriginal Array:");
        printArray(arr);
        
        alternatingPostiveNegativeSign(arr, n);
    }
}
