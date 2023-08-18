package Github;

public class prefixAnyWord {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.startsWith(searchWord)) {
                return count + 1;
            }
            count++;
        }

        return -1;
    }
    public static void main(String[] args) {
        int a=isPrefixOfWord("i love eating burger","burg");
        System.out.println(a);
    }
}
