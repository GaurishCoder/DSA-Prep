public static void print2DArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            System.out.print(arr[i][j] + " ");
        }
    }
    System.out.println();
}

public static void main(String[] args) {
    
    int matrix[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

    int n = matrix.length;
    int m = matrix[0].length;

    System.out.println("\n2D Original Array:");

    print2DArray(matrix);
}
