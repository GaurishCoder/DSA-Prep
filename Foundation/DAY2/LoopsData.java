

public class LoopsData {
 public static void main(String[] args) {
   
    int num = 123;
    int sum=0;
    while(num!=0){
        int last = num%10;
        sum+=last;
        num/=10;
    }
    System.out.println("sum of digit of a number is:"+sum);
 }   
}
