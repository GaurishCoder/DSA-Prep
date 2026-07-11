package DAY29;

public class MissingRepeating {

    public static void findMissingRepeatingElem(int[] arr, int n) {
        int SA = 0, SN = 0;
        SN = (n * (n + 1) / 2);// sum of n natural num;
        for (int i : arr) {
            SA += i; // sum of elem of array
        }
        int S2 = 0, S2N = 0;
        S2N = ((n * (n + 1) * (2 * n + 1)) / 6); // sum of square of n natural num
        for (int i : arr) {
            S2 += (i * i); // sum of square of elem of array
        }

        int val1 = SA - SN; // x-y
        int val2 = S2 - S2N;
        val2 = val2 / val1;// x+y
        int x = (val1 + val2) / 2;
        int y = (x - val1);

        System.out.println("Repeating Value:" + x);
        System.out.println("Missing Value:" + y);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 6, 7, 5, 7 };
        int n = arr.length;
        System.out.println("\nOriginal Array:");
        printArray(arr);

        findMissingRepeatingElem(arr, n);
    }
}
