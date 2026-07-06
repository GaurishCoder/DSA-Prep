package DAY24;

import java.util.ArrayList;

public class majorityElem2 {

    public static void findMajorityElemII(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int elem1 = 0, elem2 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++) {
            if (c1 == 0 && arr[i] != elem2) {
                elem1 = arr[i];
                c1 = 1;
            } else if (c2 == 0 && arr[i] != elem1) {
                elem2 = arr[i];
                c2 = 1;
            } else if (arr[i] == elem1) {
                c1++;
            } else if (arr[i] == elem2) {
                c2++;
            } else {
                c1--;
                c2--;
            }

        }

        c1=0;c2=0;
        for (int i = 0; i < arr.length; i++) {
            if (elem1==arr[i]) {
                c1++;
            }
            if (elem2==arr[i]) {
                c2++;
            }
        }

        if (c1>(n/3)) {
            ans.add(elem1);
        }
        if (c2>(n/3)) {
            ans.add(elem2);
        }
        System.out.println("Majority Element in Array's are:"+ans);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 2, 1, 1,  };
        int n = arr.length;
        System.out.println("\nOriginal Array:");
        printArray(arr);

        findMajorityElemII(arr, n);
    }
}
