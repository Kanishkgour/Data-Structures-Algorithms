public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int startRow, endRow, startCol, endCol, n;
        n = matrix.length;
        startRow = 0;
        endRow = n - 1;
        startCol = 0;
        endCol = n - 1;
        while (startRow <= endCol && startCol <= endCol) {
            // startCol=1
            // endrow=1
            // startCol=1
            // endcol=1
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            } // 0,0 0,1 0,2
              // System.out.println();
            startRow++;
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            } // 1,2 2,2
              // System.out.println();
            endCol--;
            for (int i = endCol; i >= startCol; i--) {
                System.out.print(matrix[endRow][i] + " ");
            }
            //
            // 2,1 2,0
            // 2,1 2,0
            // System.out.println();
            endRow--;
            for (int i = endRow; i >= startRow; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }
            // endrow=1
            // startrow=1
            // i=1
            // 1,0
            // System.out.println();
            startCol++;
        }
        System.out.println();
        System.out.println("-----End-------");
    }

    public static void main(String[] args) {
        int TestMatrix1[][] = {
                { 1, 2, 3 },
                { 8, 9, 4 },
                { 7, 6, 5 }
        };
        int TestMatrix2[][] = {
                { 1, 2, 3, 4 },
                { 12, 13, 14, 5 },
                { 11, 16, 15, 6 },
                { 10, 9, 8, 7 },
        };


        printSpiral(TestMatrix1);
        System.out.println();
        printSpiral(TestMatrix2);
        // System.out.println(matrix.length);
    }
}
