package DAY9;

import java.util.ArrayList;

public class MergeSortAlgo {

    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);   
            right++;
        }
        
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i-low);
        }

    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low == high)
            return;
        int mid = (low + high) / 2;
        // divide left part
        mergeSort(arr, low, mid);
        // divide right part
        mergeSort(arr, mid + 1, high);
        // merge array
        merge(arr, low, mid, high);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 4, 1, 5, 6, 2, 4 };
        System.out.println("Before Merge Sort:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Merge Sort:");
        printArray(arr); // 1,1,2,2,3,4,4,5,6

    }
}
