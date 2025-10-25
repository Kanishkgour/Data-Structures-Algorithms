public class index {
    public static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }
    }

    public static void inverseTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println();
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
        }
    }

    public static void halfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");

            }
        }
    }

    public static void inverseHalfPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
        }
    }

    public static void charTriangle(int n) {
        int a = 65;
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (a) + " ");
                a++;
            }
        }
    }

    public static void inverseCharTriangle(int n) {
        int a = 65;
        for (int i = n; i >= 1; i--) {
            System.out.println();
            for (int j = i; j >= 1; j--) {
                System.out.print((char) (a) + " ");
                a++;
            }
        }
    }

    public static void hollowSquare(int n) {
        for (int row = 1; row <= n; row++) {
            System.out.println();
            for (int col = 1; col <= n; col++) {
                if ((row == 1 || row == 5) || (col == 1 || col == n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

        }
    }

    public static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        // System.out.println(n + "! is: " + result);
        return result;
    }

    public static int binomialCoeff(int n, int r) {
        int nf = factorial(n);
        int rf = factorial(r);
        int nmrf = factorial(n - r);

        int ncr = (nf) / (rf * nmrf);
        System.out.print("Binomial Coefficient :" + n + "C" + r + " is : ");
        return ncr;

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(87));
    }
}
