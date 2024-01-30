package Array;
import java.util.*;

public class EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for (String token : tokens) {
            if ("*".equals(token) || "+".equals(token) || "-".equals(token) || "/".equals(token)) {
                int num2 = s.pop();
                int num1 = s.pop();
                s.push(calculate(num1, num2, token));
            } else {
                s.push(Integer.parseInt(token));
            }
        }
        return s.pop();
    }

    public static int calculate(int num1, int num2, String token) {
        int ans = 0;
        if ("*".equals(token)) {
            ans = num1 * num2;
        } else if ("+".equals(token)) {
            ans = num1 + num2;
        } else if ("-".equals(token)) {
            ans = num1 - num2;
        } else if ("/".equals(token)) {
            ans = num1 / num2;
        }
        return ans;
    }

    public static void main(String[] args) {
        String []tokens = {"2", "1", "+", "3", "*"};

        System.out.println(evalRPN(tokens));
    }
}
