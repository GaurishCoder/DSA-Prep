package DAY13;

public class moveZeros {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void moveZerosToEnd(int[] arr, int n) {
        int i = 0, j = i+1;
        while (j <= n-1) {
            if (arr[i] == 0 && arr[j] != 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] != 0) {
                i++;
                j++;
            } else {
                j++;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,0,1,0,4,0 };
        int n = arr.length;

        System.out.println("\nOriginal Array:");
        printArray(arr);

        moveZerosToEnd(arr, n);
        System.out.println("After Moving Zero to end:");
        printArray(arr);

    }
}
