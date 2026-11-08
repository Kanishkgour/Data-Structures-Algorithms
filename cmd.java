public class cmd {
    public static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    // average of three numbers
    public static double averageof3(int num1, int num2, int num3) {
        double result = (double) (num1 + num2 + num3);
        result = result / (double) (3);
        return result;
    }

    public static boolean isEven(int num) {
        if (num == 0) {
            System.out.println("Zero is neither even nor odd");
        }
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    

    public static void main(String[] args) {
    }
}
