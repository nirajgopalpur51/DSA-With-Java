package Stack;
import java.util.*;
public class StackUsingTwoQueues {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUsingTwoQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        q1.add(x);
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
    }

    public int pop() {
        if (q1.isEmpty()) {
            return -1; // Or throw an exception
        }
        return q1.poll();
    }

    public int top() {
        if (q1.isEmpty()) {
            return -1; // Or throw an exception
        }
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
