public class RemovingStarsFromaString {
        public static String removeStars(String s) {
            Deque<Character> stack = new ArrayDeque<>();

            for (char c : s.toCharArray()) {
                if (c == '*' && !stack.isEmpty()) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            char[] result = new char[stack.size()];
            int index = 0;
            while (!stack.isEmpty()) {
                result[index++] = stack.pop();
            }

            return new String(result);
        }

    public static void main(String[] args) {
       String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
}
