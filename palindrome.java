public class palindrome {
    public static void isPalindrome(String str) {
        String duplicate = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            duplicate += str.charAt(i);
        }
        System.out.println("str: " + str);
        System.out.println("duplicate: " + duplicate);
        if (duplicate.equals(str)) {
            System.out.println(str + " is Pallindrome");
        } else {
            // System.out.println(" Not a valid Pallindrome");
        }

    }

    public static void main(String[] args) {
        isPalindrome("1221221");
    }
}