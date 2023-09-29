public class SplitaStringinBalancedStrings {
    public static int balancedStringSplit(String s) {
        int l=0, r=0, count =0;
        for(Character i : s.toCharArray()){
            if(i=='R')
                r++;
            else
                l++;
            if(l==r){
                count++;
                l=r=0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }
}
