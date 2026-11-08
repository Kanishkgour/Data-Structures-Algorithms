public class DiagonalSum {
    public static void diagoalSum(int matrix[][]) { // iski time complexity n^2 hai jo jyada hai
        int sum = 0;
        // while(true){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j || i + j == matrix.length - 1) {
                    if (matrix[i][j] == matrix[j][i]) {
                        sum += matrix[i][j];
                        continue;
                    }
                    sum += matrix[i][j];
                }
                ;
                // System.out.print("("+ i+ ","+ j+ ")");
            }
        }
        System.out.println(sum);

    }

    public static void optimizeDiagonalSum(int matrix[][]) {// iski time complexity n hai jo jyada hai
        int sum, n;
        sum = 0;
        n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
            // i+j = n-1
            // j = n-1-i
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int TestCase1[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int TestCase2[][] = {
                { 1, 2, 3, 9 },
                { 4, 5, 6, 6 },
                { 10, 3, 6, 2 },
                { 7, 8, 9, 5 }
        };
        int TestCase3[][] = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };

        diagoalSum(TestCase1);
        optimizeDiagonalSum(TestCase1);

        diagoalSum(TestCase2);
        optimizeDiagonalSum(TestCase2);

        diagoalSum(TestCase3);
        optimizeDiagonalSum(TestCase3);

    }
}
