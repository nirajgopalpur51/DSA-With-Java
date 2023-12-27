package Stack;

import java.util.*;

public class MakeTheStringGreat {
    public static String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(c -  stack.peek()) == 32){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }

        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s="leEeetcode";
        System.out.println(makeGood(s));
    }
}
