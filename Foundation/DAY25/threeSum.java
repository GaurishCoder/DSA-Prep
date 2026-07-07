package DAY25;

import java.util.*;

public class threeSum {

    public static void threeSumOptimal(int[] arr, int n) {
        Arrays.sort(arr);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }
            }
        }

        System.out.println(ans);
    }

    // TC:O(n^2) and SC:O(1)
    public static void threeSumByBetterForce(int[] arr) {
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> st = new HashSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                int third = -(arr[i] + arr[j]);
                if (st.contains(third)) {
                    List<Integer> list = Arrays.asList(arr[i], arr[j], third);
                    Collections.sort(list);
                    ans.add(list);
                }
                st.add(arr[j]);
            }
        }
        System.out.println(ans);
    }

    // TC:O(n^3) and SC:O(1)
    public static void threeSumByBruteForce(int[] arr) {
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(list);
                        ans.add(list);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 0 };
        int n = arr.length;
        System.out.println("\nOriginal Array:");
        printArray(arr);

        System.out.println("Triplets that are equals to sum:");
        threeSumByOptimalForce(arr, n);
    }
}
