package DAY14;

public class maximumConsective {

    public static void maximumConsectiveOnes(int[] arr,int n){
        int maxCount=0,count=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==1) {
                count++;
            }else{
                maxCount=count;
                count=0;
            }
        }
        System.out.println(maxCount>count ? maxCount : count);
    }
    
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 0, 1};
        int n = arr.length;

        System.out.println("\nOriginal Array:");
        printArray(arr);
        
        System.out.println("\nMaximum Consecutive Ones in Array:");
        maximumConsectiveOnes(arr,n);
    }
}
