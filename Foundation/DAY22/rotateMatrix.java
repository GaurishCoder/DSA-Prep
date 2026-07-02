package DAY22;

public class rotateMatrix {
    public static void swap2D(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void reverse2DArray(int[][] arr, int n, int m) {
        int e = m - 1, col = 0;
        while (col < (m / 2)) {
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i][col];
                arr[i][col] = arr[i][e];
                arr[i][e] = temp;
            }
            col++;
            e--;
        }
    }

    public static void rotateMatrixBy90(int[][] arr, int n, int m) {
       
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i < j) {
                    swap2D(arr, i, j);
                }
            }
        }

        reverse2DArray(arr, n, m);
        System.out.println("Matrix Rotated By 90deg:");
        print2DArray(arr);
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int matrix[][] = { { 0, 1, 1, 2 }, { 2, 0, 3, 1 }, { 4, 5, 0, 5 }, { 5, 6, 7, 0 } };

        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println("\n2D Original Array:");

        print2DArray(matrix);
        rotateMatrixBy90(matrix, n, m);

    }

}
