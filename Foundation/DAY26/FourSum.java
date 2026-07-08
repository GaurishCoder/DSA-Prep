package DAY26;

import java.math.BigInteger;
import java.util.*;

public class FourSum {
    public static void fourSumByOptimalForce(int[] arr, int n, int target) {
        Set<List<Integer>> ans = new HashSet<>();   
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                int k = j + 1, l = n - 1;
                if (j > i+1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                while (k < l) {
                    long sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                        ans.add(list);
                        k++;
                        l--;
                        while (k<l && arr[k] == arr[k - 1]) {
                            k++;
                        }
                        while (k<l && arr[l] == arr[l + 1]) {
                            l--;
                        }   
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
        int arr[] = { 4,3,3,4,4,2,1,2,1,1 };
        int n = arr.length;
        System.out.println("\nOriginal Array:");
        printArray(arr);

        System.out.println("Quadruplets that are equals to sum:");
        fourSumByOptimalForce(arr, n, 9);//[[1,1,3,4],[1,2,2,4],[1,2,3,3]]

    }
}