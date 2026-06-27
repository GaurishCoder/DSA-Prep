
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
    }