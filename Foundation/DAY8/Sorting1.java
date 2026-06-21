package DAY8;

public class Sorting1 {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            // find min element
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // swap min element with first element in array
            swap(arr, i, minIdx);
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - 1 - i); j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 4, 3, 5, 1, 2 };
        System.out.println("Original Array:");
        printArray(arr);

        // Selection Sort
        System.out.println("Selection Sort:");
        selectionSort(arr);

        // Bubble Sort
        System.out.println("Bubble Sort:");
        bubbleSort(arr);

        // Insertion Sort
        System.out.println("Insertion Sort:");
        insertionSort(arr);

        printArray(arr);
    }



    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while(j>0 && arr[j-1]>arr[j] ){
                swap(arr,j,j-1);
                j--;
            }
        }
    }


}
