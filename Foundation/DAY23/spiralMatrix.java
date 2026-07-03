package DAY23;

public class spiralMatrix {

    public static void printSpiralMatrix(int[][] arr, int n, int m) {
        int top = 0, left = 0, right = m - 1, bottom = n - 1;

        while (left <= right && top <= bottom) {
            // left->right
            for (int i = left; i <= right; i++) {
                System.out.print(arr[left][i]+" ");
            }
            top++;

            // top->bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right]+" ");
            }
            right--;

            // right->left
            for (int i = right; i >= left; i--) {
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;

            // bottom->top
            for (int i = bottom; i >= top; i--) {
                System.out.print(arr[i][left]+" ");
            }
            left++;
        }

    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3, 4 },{ 5, 6, 7, 8 },{ 9, 10, 11, 12 },{ 13, 14, 15, 16 } };

        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println("\n2D Original Array:");

        print2DArray(matrix);

        System.out.println("Spiral Matrix");
        printSpiralMatrix(matrix, n, m);
    }

}


//: 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10.