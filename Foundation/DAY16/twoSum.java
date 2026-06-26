import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void twoPointerForTwoSum(int[] arr, int n, int t) {
        Arrays.sort(arr);
        int l = 0, r = n - 1;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == t) {
                System.out.println("Target exists in array");
                break;
            } else if (sum > t) {
                r--;
            } else {
                l++;
            }
        }
        if (l >= r) {
            System.out.println("Target does not exists in array");
        }
    }

    public static void hashingApproachForTwoSum(int[] arr, int n, int t) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int cal = t - arr[i];
            if (map.containsKey(cal)) {
                ans.add(i);
                ans.add(map.get(cal));
                break;
            }
            map.put(arr[i], i);
        }
        if (ans.size() != 0) {

            System.out.println("Target exists in array at:" + ans);
        } else {
            ans.add(-1);
            ans.add(-1);
            System.out.println("Target does not exists in array:" + ans);
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 8, 11 }, target = 18;

        int n = arr.length;

        System.out.println("\nOriginal Array:");
        printArray(arr);

        // hashingApproachForTwoSum(arr, n, target);// [1,3]
        twoPointerForTwoSum(arr, n, target);// [1,3]
    }
}
