package Advance_Patterns;

public class inv_rot_half_pyramid {
    public static void pattern(int row_col) {
        for (int i = 1; i <= row_col; i++) {
            System.out.println();
            for (int j = 1; j <= row_col; j++) {
                if (i == row_col || j == row_col || i + j > row_col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }

    public static void numpy(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
        }
    }

    public static void main(String[] args) {
        // pattern(10);
        numpy(5);

    }
}
