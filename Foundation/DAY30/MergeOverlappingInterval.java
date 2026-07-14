package DAY30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingInterval {

    public static void merge(int[][] intervals) {
        // Sort intervals based on start time
        Arrays.sort(
                intervals,
                (a, b) -> Integer.compare(a[0], b[0]));

        // List to store merged intervals
        List<List<Integer>> merged = new ArrayList<>();

        // Traverse through all intervals
        for (int[] interval : intervals) {
            // If merged list is empty or no overlap
            if (merged.isEmpty() ||
                    merged.get(merged.size() - 1).get(1) < interval[0]) {
                // Add current interval as a new block
                merged.add(
                        Arrays.asList(interval[0], interval[1]));
            } else {
                // Overlapping: update end to max of both
                int last = merged.size() - 1;
                int maxEnd = Math.max(
                        merged.get(last).get(1),
                        interval[1]);
                merged.get(last).set(1, maxEnd);
            }
        }

        System.out.println("Aftr Merge Interval ");
        System.out.println(merged);
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int n = arr.length;
        System.out.println("\nOriginal Array:");
        print2DArray(arr);

        merge(arr);
    }
}
