package Advance_Patterns;

public class Holrec {
    public static void hollowRectangle(int row, int col) {
        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                };
            }
        }
    }

    public static void main(String[] args) {
        hollowRectangle(6, 25);
    }
}
