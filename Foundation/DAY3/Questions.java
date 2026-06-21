package DAY3;

public class Questions {
    public static int squareOfNumber(int n) {
        return n * n;
    }

    public static String findEvenOdd(int n) {
        if (n % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    public static int findFactorial(int n) {

        int factorial = 1;
        while (n >= 1) {
            factorial = factorial * n;
            --n;
        }
        return factorial;
    }

    public static void sumOfElementInArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("sum of element in the array:" + sum);

    }

    public static void findLargestElement(int[] arr) {

        int largest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > largest) {
                largest = i;
            }
        }
        System.out.println("Largest Element in the array:" + largest);

    }

    public static void countVowel(String str) {
        char vowel[] = { 'a', 'i', 'e', 'u', 'o' };
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            for (char c : vowel) {
                if (str.charAt(i) == c || str.charAt(i) == Character.toUpperCase(c)) {
                    vowelCount++;
                }
            }
        }
        System.out.println("Vowel in the word is " + vowelCount);
    }

    public static Boolean checkPalindrome(String str) {
        /**
         * str = "madam"
         * 
         */
        String ans = "";
        for (int i = str.length()-1; i >= 0; i--) {
            ans = ans + str.charAt(i);
        }
        if (!str.equals(ans)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Create a function to find the square of a number
        // System.out.println(squareOfNumber(2));

        // Create a function to check whether a number is even or odd
        // System.out.println(findEvenOdd(12));

        // Create a function to calculate factorial
        // System.out.println(findFactorial(5));

        // int arr[] = { 4, 26, 1, 7, 9 };

        // findLargestElement(arr);
        // sumOfElementInArray(arr);

        // Count vowels in a string
        // String str = "ProgrammIng";
        // countVowel(str);

        // Check whether a string is a palindrome
        String str = "madam";
        System.out.println("String is palindrome(true/false):" + checkPalindrome(str));

    }
}
