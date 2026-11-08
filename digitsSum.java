public class digitsSum {
    public static void sumOfdigit(int num) {
        int sum = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            sum += lastdigit;
            num = num / 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int num = 122121;
        sumOfdigit(num);
    }
}
