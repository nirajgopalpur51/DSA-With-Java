package Github;

public class LongestUncommonSubsequenceI {
    public static int findLUSlength(String a, String b) {
        if(a.equals(b))
            return -1;
        if(a.length()>b.length())
            return a.length();
        else
            return b.length();
    }
    public static void main(String[] args) {
        System.out.println(findLUSlength("aba","cdc"));
    }
}
