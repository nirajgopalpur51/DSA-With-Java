public class rotateString {
    public static boolean rotateString(String s, String goal) {
        return (s.length()==goal.length() && (s+s).contains(goal));
    }

    public static void main(String[] args) {
        boolean b=rotateString("abcde","cdeab");
        System.out.println(b);
    }
}
