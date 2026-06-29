package DAY19;

import java.util.ArrayList;
import java.util.List;

public class printPermutation {

    public static List<List<Integer>> generatePermutations(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(arr, 0, ans);
        return ans;
    }

    private static void helper(int[] arr, int index, List<List<Integer>> ans) {

        // Base case
        if (index == arr.length) {
            List<Integer> permutation = new ArrayList<>();

            for (int num : arr) {
                permutation.add(num);
            }

            ans.add(permutation);
            return;
        }

        for (int i = index; i < arr.length; i++) {

            swap(arr, index, i);

            helper(arr, index + 1, ans);

            // Backtracking
            swap(arr, index, i);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };

        List<List<Integer>> result = generatePermutations(arr);
        // System.out.println(result);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        for (List<Integer> permutation : result) {
            if (permutation.equals(list)) {
                int idx = result.indexOf(permutation);
                System.out.println(idx);
                System.out.println(result.get((idx+1)));
            }
        }
    }
}
