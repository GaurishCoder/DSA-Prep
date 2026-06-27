package DAY17;

public class majorityElement {

    public static void majorityElemByMooresAlgo(int[] arr, int n) { // 7, 0, 0, 1, 7, 7, 2, 7, 7
        int elem = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                elem = arr[i];
                count++;
            } else if (elem == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        count=0;
        for (int i = 0; i < arr.length; i++) {
            if (elem==arr[i]) {
                count++;
            }
        }

        if (count>(n/2)) {
            System.out.println("Majority Element in array:"+elem);
            return;
        }

    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 1, 2 };

        int n = arr.length;

        System.out.println("\nOriginal Array:");
        printArray(arr);

        majorityElemByMooresAlgo(arr, n);
    }
}
