public class sortOneTwoZero {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // optimal approach
    public static void sortZerosOnesTwosOptimal(int[] arr, int n) {
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    // better approach
    public static void sortZerosOnesTwos(int[] arr, int n) {
        int count1 = 0, count0 = 0, count2 = 0;
        for (int i : arr) {
            if (i == 0) {
                count0++;
            } else if (i == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        for (int i = 0; i < arr.length; i++) { // 0,1,0,2,1,0,0,1,2,0
            if (count0 != 0) {
                arr[i] = 0;
                count0--;
            } else if (count1 != 0) {
                arr[i] = 1;
                count1--;
            } else {
                arr[i] = 2;
                count2--;
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
        int arr[] = { 0, 1, 0, 2, 1, 0, 0, 1, 2, 0 };

        int n = arr.length;

        System.out.println("\nOriginal Array:");
        printArray(arr);

        sortZerosOnesTwosOptimal(arr, n);
        System.out.println("\nSorted Array:");
        printArray(arr);
    }
}
