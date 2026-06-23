package DAY15;

public class longestSubarraySum {
    public static void findLongestSubarraySum(int[] nums, int n, int k) {

        // To store the maximum length of the subarray
        int maxLen = 0;

        // Pointers for sliding window
        int left = 0, right = 0;

        // Sum of the current window
        int sum = nums[0];

        // Traverse through the array
        while (right < n) {

            // Shrink the window if sum exceeds k
            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            // Update max length if sum equals k
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Expand the window to the right
            right++;
            if (right < n) {
                sum += nums[right];
            }
        }

       System.out.println("Maximum subarray length is equal to sum:"+maxLen);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, 9 };

        int n = arr.length;

        System.out.println("\nOriginal Array:");
        printArray(arr);

        findLongestSubarraySum(arr, n, 15);
    }
}
