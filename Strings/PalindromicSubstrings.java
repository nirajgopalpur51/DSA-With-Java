package Github;

public class PalindromicSubstrings {
    int expandAroundindex(String s,int i,int j){
        int count=0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j) ){
            count++;
            i--;
            j++;
        }
        return count;
    }
    public int countSubstrings(String s) {
        int count=0;
        int n=s.length();
        for(int i=0; i<n; i++){
            //odd
            int oddKaAns=expandAroundindex(s,i,i);
            count=count+oddKaAns;
            //even
            int evenKaAns=expandAroundindex(s,i,i+1);
            count=count+evenKaAns;
        }
        return count;
    }
    public static void main(String[] args) {
        PalindromicSubstrings p=new PalindromicSubstrings();
        System.out.println(p.countSubstrings("aaa"));

    }
}
