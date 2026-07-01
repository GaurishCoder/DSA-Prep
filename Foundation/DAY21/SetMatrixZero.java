package DAY21;

public class SetMatrixZero {

    public static void setRowsColsToZero(int[][] matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // top
                    int r = i, c = j;
                    while (r > 0) {
                        r--;
                        if (!(matrix[r][c] == 0)) {
                            matrix[r][c] = -1;
                        }
                    }
                    // down
                    r = i;
                    c = j;
                    while (r < n) {
                        if (!(matrix[r][c] == 0)) {
                            matrix[r][c] = -1;
                        }
                        r++;
                    }
                    // left
                    r = i;
                    c = j;
                    while (c >= 0) {

                        if (!(matrix[r][c] == 0)) {
                            matrix[r][c] = -1;
                        }
                        c--;

                    }
                    // right
                    r = i;
                    c = j;
                    while (c < m) {
                        if (!(matrix[r][c] == 0)) {
                            matrix[r][c] = -1;
                        }
                        c++;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j]==-1) {
                    matrix[i][j]=0;
                }
            }
        }
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int matrix[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println("\n2D Original Array:");

        print2DArray(matrix);

        System.out.println("Set Matrix Zero:");
        setRowsColsToZero(matrix, n, m);
        print2DArray(matrix);
        /**
         * [0,0,0,0],
         * [0,4,5,0],
         * [0,3,1,0]
         */
    }

}
