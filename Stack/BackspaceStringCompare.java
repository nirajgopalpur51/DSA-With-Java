package Stack;

import java.util.*;

public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();

        for(char c : s.toCharArray()){
            if( !stack1.isEmpty() && c == '#')  stack1.pop();

            else if( c == '#') continue;

            else stack1.push(c);

        }

        for(char c : t.toCharArray()){
            if(!stack2.isEmpty() && c == '#') stack2.pop();

            else if( c == '#') continue;

            else stack2.push(c);

        }
        if(stack1.isEmpty() && stack2.isEmpty()) return true;

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();

        sb1.append(stack1.pop());

        while(!stack1.isEmpty()) sb1.append(stack1.pop());
        while(!stack2.isEmpty()) sb2.append(stack2.pop());

        return sb1.toString().equals(sb2.toString());
    }
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c",  "ad#c"));
    }
}
