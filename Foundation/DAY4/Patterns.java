package DAY4;

public class Patterns {
    public static void invertedPyramid(int r) {
        for (int i = 1; i <= r; i++) {

            // space
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= ((r - i) * 2) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberLeftPyramid(int r) {
        int start;

        // Outer loop for the number of rows
        for (int i = 0; i < r; i++) {
            // If the row index is even, print 1 first
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;

            // Inner loop to print alternating 1's and 0's in each row
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                // Alternate between 1 and 0
                start = 1 - start;
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }

    public static void hollowDimondSquare(int r) {
        // upper diamond
        for (int i = 1; i <= r; i++) {
            // star
            for (int j = 1; j <= (r - i) + 1; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = (r - i) + 1; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();

        }
        // lower diamond
        for (int i = 1; i <= r; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= (r - i); j++) {
                System.out.print(" ");
            }

            // space
            for (int j = (r - i); j >= 1; j--) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    public static void hollowRectange(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == r || i == 1 || j == 1 || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void numberSquare(int r,int c) {
        for (int i = 0; i < 2 * r - 1; i++) {
            for (int j = 0; j < 2 * c - 1; j++) {
                int top = i;
                int left = j;
                int bottom = (2*r - 2) - i;
                int right = (2*r - 2) - j;
                System.out.print(r - Integer.min(Integer.min(top, bottom) , Integer.min(left, right)));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int r = 4, c = 4;

        // Inverted Pyramid Pattern
        // invertedPyramid(r);

        // Number Left Pyramid Pattern
        // numberLeftPyramid(r);

        // Hollow-Dimond Square Pattern
        // hollowDimondSquare(r);

        // Hollow Rectangle Pattern
        // hollowRectange(r, c);

        // Number Square Pattern
        numberSquare(r,c);
    }

}
