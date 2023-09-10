public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int count[]=new int[26];

        for(int ch:magazine.toCharArray()){
            count[ch-'a']++;   // 0 to 1
        }
        for(int ch:ransomNote.toCharArray()){
            count[ch-'a']--;
            if(count[ch-'a']<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean b=canConstruct("aa","aab");
        System.out.println(b);
    }
}
