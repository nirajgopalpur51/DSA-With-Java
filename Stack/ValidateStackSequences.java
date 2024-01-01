package Stack;

import java.util.*;

public class ValidateStackSequences {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();

        int j=0;
        for(int i : pushed){
            stack.push(i);
            while( !stack.isEmpty() && j<popped.length  && stack.peek()==popped[j]){
                stack.pop();
                j++;
            }
        }
        return j==popped.length;
    }

    public static void main(String[] args) {
        int []pushed = {1,2,3,4,5}, popped = {4,5,3,2,1};
        System.out.println(validateStackSequences(pushed,popped));
    }
}
