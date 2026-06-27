package DAY17;

public class maxSubarraySum {

    public static void maxSubarraySumByKadaneAlgo(int[] arr, int n) {// -2, -3, 4, -1, -2, 1, 5, -3
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            maxSum = Math.max(sum, maxSum);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("Maximum Subarray Sum is:" + maxSum);
    }

    public static void maxSubarraySumBrute(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[i];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }

        }
        System.out.println("Maximum Subarray Sum is:" + maxSum);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        int n = arr.length;

        System.out.println("\nOriginal Array:");
        printArray(arr);

        maxSubarraySumByKadaneAlgo(arr, n);// 7
    }
}
