public class firstPalindrome {
    public static String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                return words[i];
            }

        }
        return "";
    }
    public static boolean isPalindrome(String s){
        int n=s.length()-1;
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(n-i)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
//        boolean b=10==10;
//        System.out.println(b);

        String arr[] = {"abc","car","ada","racecar","cool" };
        System.out.println(firstPalindrome(arr));
    }
}
