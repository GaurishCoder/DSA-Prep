package DAY23;

import java.util.HashMap;

public class countSubarray {
    public static void totalSubarrayToK(int[] arr, int n, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        System.out.println("Total number of subarray that is equal to k is:" + count);
    }

    public static void totalSubarrayToKHashMap(int[] arr, int n, int k) {
        int count = 0;
        int totalSum = 0;
        HashMap<Integer, Integer> preSumCount = new HashMap<>(); //preSumCount<preSum,count>
        preSumCount.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            int remove = totalSum - k;
            if (preSumCount.containsKey(remove)) {
                count += preSumCount.get(remove);
            }
            preSumCount.put(totalSum, preSumCount.getOrDefault(totalSum, 0) + 1);
        }

        System.out.println("Total number of subarray that is equal to k is:" + count);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
        int k = 3;
        int n = arr.length;
        System.out.println("\nOriginal Array:");
        printArray(arr);

        // totalSubarrayToK(arr, n, k);
        totalSubarrayToKHashMap(arr, n, k);
    }
}
