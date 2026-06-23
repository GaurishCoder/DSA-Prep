package DAY15;

public class singleElement {
    public static void findSingleElement(int[] arr, int n) {
        int xor = 0;
        for (int i : arr) {
            xor ^= i;
        }
        System.out.println("Single Element in Array:" + xor);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 12, 1, 3, 31, 31, 12 };
        int n = arr.length;

        System.out.println("\nOriginal Array:");
        printArray(arr);

        findSingleElement(arr, n);
    }

}
