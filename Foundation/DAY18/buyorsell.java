package DAY18;

public class buyorsell {

    public static void stockBuyOrSell(int[] arr, int n) {
        int maxProfit = 0;
        int buyPrice = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int currPrice = arr[i];
            if (currPrice > buyPrice) {
                int profit = currPrice - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = currPrice;
            }
        }
        System.out.println("Maximum profit in array is:"+maxProfit);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 7,6,4,3,1 };

        int n = arr.length;

        System.out.println("\nOriginal Array:");
        printArray(arr);

        stockBuyOrSell(arr, n);
    }
}
