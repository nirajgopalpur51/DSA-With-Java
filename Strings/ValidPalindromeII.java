package Github;

public class ValidPalindromeII {
    boolean checkPalindrome(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }

        }
        return true;
    }
    public boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return checkPalindrome(s, i + 1, j) || checkPalindrome(s, i, j - 1);
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindromeII v=new ValidPalindromeII();
        boolean b=v.validPalindrome("abca");
        System.out.println(b);
    }
}
