package DAY28;

public class MergeSortedArray {

    public static int findIdx(int[] arr1){
        int idx=0;
        for (int i = arr1.length-1; i >= 0; i--) {
            if (arr1[i]!=0) {
                idx=i;
                break;
            }
        }
        return idx;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void mergeTwoArray(int[] arr1,int[] arr2) {
        int i = findIdx(arr1);
        int j= arr2.length-1;
        int k = arr1.length-1;
        while (i>=0 && j>=0) {
            if (arr1[i]>arr2[j]) {
                swap(arr1,i,k);
                i--;
                k--;
            }else{
                int temp = arr2[j];
                arr2[j]=arr1[k];
                arr1[k]=temp;
                j--;
                k--;
            }
        }

        System.out.println("Merge Array InPlace:");
        printArray(arr1);
    }


    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[] = { -5, -2, 4, 5, 0, 0, 0 };
        int arr2[] = { -3, 1, 8 };
        int n = arr1.length;
        System.out.println("\nOriginal Array 1:");
        printArray(arr1);
        System.out.println("\nOriginal Array 2:");
        printArray(arr2);
        
        mergeTwoArray(arr1, arr2);
    }
}
