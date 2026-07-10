package DAY28;

import java.util.HashMap;

public class xorSubarray {
    // TC:O(N) SC:O(N)
    public static void countSubarrayUsingXOROptimal(int[] arr, int k) {
        int count = 0;
        int xr = 0;
        HashMap<Integer, Integer> frontXor = new HashMap<>(); //xor value and count
        frontXor.put(0, 1);
        for (int i : arr) {
            xr ^= i;
            int x = xr ^ k; // formula
            if (frontXor.containsKey(x)) {
                count += frontXor.get(x);
            }
            frontXor.put(xr, frontXor.getOrDefault(xr, 0) + 1);
        }
        System.out.println("Maximum Subarray length using xor:" + count);
    }

    // TC:O(N^2) SC:O(1)
    public static void countSubarrayUsingXOR(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int xor = 0;
            for (int j = i; j < arr.length; j++) {
                xor ^= arr[j];
                if (xor == k) {
                    count++;
                }
            }
        }
        System.out.println("Maximum Subarray length using xor:" + count);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 2, 6, 4 };
        int n = arr.length;
        System.out.println("\nOriginal Array:");
        printArray(arr);

        countSubarrayUsingXOROptimal(arr, 6);
    }
}
