package Github;

public class TruncateSentence {
    public static String truncateSentence(String s, int k) {
        int count =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ') count++;
            if(count == k) return s.substring(0,i);
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
    }
}
