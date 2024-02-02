public class LargestSubstringBetweenTwoEqualCharacters {
    public static int maxLengthBetweenEqualCharacters(String s) {
        int max=-1;
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>i;j--){
                if(s.charAt(i)==s.charAt(j)){
                    max=Math.max(max,((j-i)-1));
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("abca"));
    }
}
