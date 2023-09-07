package Github;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        int count[]=new int[128];  //65-90  &  97-122
        for(int ch:s.toCharArray())
            count[ch]++;
        int res=0;
        for(int i=0; i<128; i++){
            int val=count[i];
            res=res+(val/2)*2;
            if(res%2==0 && val%2==1)
                res++;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}
