package DAY10;

public class QuickSortAlgo {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = placePivotfindPartition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }

    // findPartition() -> it places the pivot at its correct posititon and find
    // partition position
    public static int placePivotfindPartition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low - 1) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, j, low);
        return j;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 10, 1, 4, 2 }, n = arr.length;
        System.out.println("Before Quick Sort:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("\nAfter Quick Sort:");
        printArray(arr); // 1,1,2,2,3,4,4,5,6

    }
}
