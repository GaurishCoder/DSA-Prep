package DAY6;

public class ParameterFunctionRecursion {
    // Parameterize Recursion
    static void sumOfFirstNNumberP(int i, int sum) {
        if (i < 1) {
            System.out.print(sum);
            return;
        }
        sumOfFirstNNumberP(i - 1, sum + i);

    }

    // Function Recursion
    static int sumOfFirstNNumberF(int n) {
        if (n == 0) {
            return 1;
        }
        return n * sumOfFirstNNumberF(n - 1);

    }

    public static void main(String[] args) {
        // sumOfFirstNNumberP(10, 0);

        System.out.println(sumOfFirstNNumberF(5));

    }
}
