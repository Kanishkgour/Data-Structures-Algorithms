public class SearchInMatrix {

    public static boolean findElementInMatrix(int matrix[][], int Element) {
        int n = matrix.length;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (matrix[i][j] == Element) {
                    System.out.print("Element:" + Element + " is Found at index: [" + i + "," + j + "]\n");
                    return true;
                }
            }
            // i+j = <= n-1
            // j = n-1-i
            // 0,2
            // 1,1
            // 2,0
        }
        System.out.print("Not Found\n");
        return false;
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
        // System.out.println(TestCase1.length);
        findElementInMatrix(TestCase1, 5);
        findElementInMatrix(TestCase2, 41);
        findElementInMatrix(TestCase3, 18);
    }
}
