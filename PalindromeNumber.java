public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        int length = number.length();
        for (int i = 0; i < length / 2; i++) {
            if (number.charAt(i) != number.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean b=isPalindrome(121);
        System.out.println(b);
    }
}
