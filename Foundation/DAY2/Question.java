package DAY2;

import java.util.Scanner;

public class Question {
    public static void sumOfNNumber(int num) {
        // num=10 1 to 10;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum of first n number is " + sum);
    }

    public static void reverseNumber(int num) {
        /**
         * num = 123
         * reverse = 321
         * 0 * 10 + 3 -> 3
         * 3 * 10 + 2 -> 32
         * 32 * 10 + 1 -> 321
         */

        int reverse = 0;
        while (num != 0) {
            int last = num % 10;
            reverse = reverse * 10 + last;
            num /= 10;
        }
        System.out.println("Reverse of a number is " + reverse);
    }


    public static void gcdOfNumbers(int n1,int n2){
        int gcd = 1;
        for (int i = 1; i <= Integer.min(n1, n2); i++) {
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }

    public static void main(String[] args) {
        // Find the sum of first N natural numbers
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number:");
        // int num = sc.nextInt();
        // sumOfNNumber(num);

        // Reverse a number
        // reverseNumber(num);

        // GCD of Two numbers
        gcdOfNumbers(9,12);
    }
}
