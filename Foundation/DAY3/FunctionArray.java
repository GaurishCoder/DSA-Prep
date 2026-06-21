package DAY3;

import java.util.Scanner;

public class FunctionArray {
    public static void printArray(String fruits[]){
        for(String f:fruits){
            System.out.println(f);
        }
    }

    public static void inputArray(String fruits[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("enter fruit "+(i+1)+" name:");
            fruits[i]= sc.nextLine();
        }
        sc.close();
    }

    // Function
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.println("enter two number:");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("sum of two number:" + sum(a, b));

        // String fruits[] = new String[3];
        // inputArray(fruits);
        // System.out.println("Fruits are:");
        // printArray(fruits);

        int arr[][] = {{1,2},{3,4},{5,6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
