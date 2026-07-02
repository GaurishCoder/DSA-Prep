package DAY1;
import java.util.Scanner;


public class Input {
    public static int getInteger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        return n;
    }
    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        sc.close();
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getInteger();
        sc.close();
    }
}
