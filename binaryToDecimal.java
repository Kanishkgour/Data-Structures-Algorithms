public class binaryToDecimal {

    // public static void lastDigit(int num) {
    // for (int i = 0; i < 8; i++) {
    // System.out.println(num % 10);
    // num = num / 10;
    // }
    // }

    // public static void convertIntoDecimal(int n) {
    // int decimal = 0;
    // int i = 0;
    // while (n > 0) {
    // int lastDigit = n % 10;
    // decimal = decimal + (lastDigit) * (int) Math.pow(2, i);
    // i++;
    // n = n / 10;
    // }
    // System.out.println(decimal);
    // }

    public static int BinaryToDecimal(int n) {
        int decimal = 0, power = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            decimal = decimal + lastDigit * (int) (Math.pow(2, power));
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        // System.out.println("Binary to Decimal");
        // convertIntoDecimal(1010100);
        int result = BinaryToDecimal(1001000);
        System.out.println(result);
    }
}
