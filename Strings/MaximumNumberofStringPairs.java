package Github;

public class MaximumNumberofStringPairs {
    public static int maximumNumberPairs(String[] words) {
        int ans = 0;
        for (int i = 0; i < words.length; i ++) {
            for(int j = i + 1; j < words.length; j ++)
                if(words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0))
                    ans ++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] words={"cd","ac","dc","ca","zz"};
        System.out.println(maximumNumberPairs(words));
    }
}
