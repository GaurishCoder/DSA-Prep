package DAY14;

import java.util.Arrays;

public class missing {

    public static void missingElement(int[] arr,int n) {
        int sumOfN = 0 , totalSumOfArray = 0;
        for (int i : arr) {
            totalSumOfArray+=i;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>sumOfN){
                sumOfN = arr[i];
            }
        }
        n=sumOfN;
        sumOfN = (n*(n+1))/2;
        System.out.println(sumOfN);
        System.out.println(totalSumOfArray);
        System.out.println("Missing element in array:"+(sumOfN - totalSumOfArray));
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 8, 2, 4, 5, 3, 7, 1 };
        int n = arr.length;

        System.out.println("\nOriginal Array:");
        printArray(arr);

        missingElement(arr,n);

    }
}
