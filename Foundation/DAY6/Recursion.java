

public class Recursion {

    static void printNames(String name,int times){
        // base condition
        if(times==1){
            System.out.println(name);
            return;
        }
        // self work
        System.out.println(name);
        // recursive work
        printNames(name, times-1);
    }
    static void printNumber(int n){
        // base condition
        if(n==1){
            System.out.println(n);
            return;
        }
        // recursive work
        
        // self work
        System.out.println(n);
        printNumber(n-1);
    }


    public static void main(String[] args) {
        
        // printNames("Vinay",5);
        printNumber(10);
    }
}
