package DAY12;

public class checkArraySorted {

    public static boolean checkSorted(int[] arr, int n) {
        boolean result = true;
        for (int i = 1; i < arr.length; i++) {
            int prev = arr[i - 1];
            if (arr[i] < prev) {
                return false;
            }
        }
        return result;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 7, 15 };
        int n = arr.length;

        System.out.println("\nOriginal Array:");
        printArray(arr);

        if (checkSorted(arr, n)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

    }
}
