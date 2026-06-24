package DAY15;

public class longestSubarrayWithNegative {
    public static void findLongestSubarraySum(int[] arr, int n, int k){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if (sum==k) {
                    max=Math.max(max,j-i+1);
                }
            }
        }
        System.out.println("maximum longest subarray length is:"+max);
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

        findLongestSubarraySum(arr, n, 0);// output:8
    }

}
