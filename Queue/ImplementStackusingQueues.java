package Queue;
import java.util.*;

public class ImplementStackusingQueues {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public void  MyStack() {
        // MyStack myStack = new MyStack();
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        if(!q1.isEmpty()){
            q1.add(x);
        }
        else{
            q2.add(x);
        }
    }

    public int pop() {
        int top = -1;

        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.poll();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top);
            }
        }
        else{
            while(!q2.isEmpty()){
                top = q2.poll();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
            }
        }
        return top;
    }

    public int top() {
        int top = -1;

        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.poll();
                // if(q1.isEmpty()){
                //     break;
                // }
                q2.add(top);
            }
        }
        else{
            while(!q2.isEmpty()){
                top = q2.poll();
                // if(q2.isEmpty()){
                //     break;
                // }
                q1.add(top);
            }
        }
        return top;
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}
