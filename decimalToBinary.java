public class decimalToBinary {

    public static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void dtb(int dec_Number) {
        String binary = "";
        while (dec_Number > 0) {
            binary = binary + dec_Number % 2;
            dec_Number = dec_Number / 2;
        }
        String update = reverseString(binary);
        System.out.print(update);
    }

    public static void main(String[] args) {
        dtb(112);
    }
}
