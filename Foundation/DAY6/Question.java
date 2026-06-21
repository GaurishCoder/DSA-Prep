package DAY6;

public class Question {
    static void reverseArray(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int temp = arr[e];
        arr[e] = arr[s];
        arr[s] = temp;
        reverseArray(arr, s + 1, e - 1);
    }

    static boolean checkPalindrome(String str, int s, int e) {
        if (s > e) {
            return true;
        }
        if (str.charAt(s) != str.charAt(e)) {
            return false;
        }
        return checkPalindrome(str, s + 1, e - 1);
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5 };
        // System.out.println("Original Array:");
        // printArray(arr);

        // reverseArray(arr, 0, arr.length - 1);

        // System.out.println("Reverse Array:");
        // // printArray(arr);
        // String str = "madam";
        // System.out.println(checkPalindrome(str, 0, str.length() - 1));
        int a=0,b=1;
        System.out.println("Fibonacci Series:");
        System.out.println(a);
        System.out.println(b);
        int i = 2;
        while (i<5) {
            int c = a+b;
            a=b;
            b=c;
            System.out.println(c);
            i++;
        }

    }
}
