package Stack;

import java.util.*;

public  class CrawlerLogFolder {
    public static int minOperations(String[] logs) {
        Stack stack=new Stack<>();

        for(int i=0; i<logs.length; i++){
            if( !stack.isEmpty() && logs[i].contains("../")){
                stack.pop();
            }
            else if(logs[i].contains("./")){
                continue;
            }
            else{
                stack.push(i);
            }

        }
        return stack.size();
    }

    public static void main(String[] args) {
        String arr[]={"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(arr));
    }
}
