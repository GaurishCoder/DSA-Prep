package DAY12;

public class rotateByKTimes {

    public static void rotateArrayByKTimes(int[] arr, int n, int k) {
        reverseArray(arr, k, n-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, 0, n-1);
    }

    public static void reverseArray(int[] arr, int s, int e) {
        for (int i = s, j = e; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static int[] bruteForce(int[] arr, int n, int k) {
        int[] temp = new int[n];
        int idx = 0;
        for (int i = k; i < arr.length; i++) {
            temp[idx++] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            temp[idx++] = arr[i];
        }
        return temp;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;

        System.out.println("\nOriginal Array:");
        printArray(arr);

        int k = 5;
        System.out.println("Array Rotated By " + k + " times:");
        rotateArrayByKTimes(arr, n, k);
        printArray(arr); //[3, 4, 5, 6, 1, 2]

    }

}
