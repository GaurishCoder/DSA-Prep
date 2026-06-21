package DAY12;

public class rotateByOne {
    public static void rotateArrayByOne(int[] arr, int n) {
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = first;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5,6 };
        int n = arr.length;

        System.out.println("\nOriginal Array:");
        printArray(arr);

        // rotateArrayByOne(arr, n);
        // System.out.println("Array Rotated By One:");
        // printArray(arr); // [2, 3, 4, 5, 1]
        
        
        System.out.println("Array Rotated By K(2):");
        int temp[] = rotateArrayByK(arr, n, 1);
        printArray(temp);

    }
}
