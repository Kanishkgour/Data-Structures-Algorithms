public class primes {

    public static boolean isPrime(int n) {
        boolean prime = true;
        if (n == 2 || n == 1) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                return prime;
            }
        }
        return prime;
    }


    public static void primesInRange(int n) {
        System.out.print("Prime num: [ ");
        for (int i = 1; i <= n; i++) {
            if (isPrime(i) == true) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("]");

    }


    public static void main(String[] args) {
        // boolean result = isPrime(11);
        // System.out.println(result);
        primesInRange(20);
    }
}
