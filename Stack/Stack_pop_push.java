
import java.util.EmptyStackException;

public class Stack_pop_push {
    private ListNode top;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next= next;
        }
    }

    public void display(){
        Stack_pop_push.ListNode current=top;
        while(current!=null){
            System.out.print(current.data+" , ");
            current=current.next;
        }
//        System.out.println("null");
    }
    public Stack_pop_push(){
        top=null;
        length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void push(int data){
        ListNode temp=new ListNode(data);
        temp.next=top;
        top=temp;
        length++;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result=top.data;
        top=top.next;
        length--;
        return result;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack_pop_push stack=new Stack_pop_push();
        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println(stack.peek());

        stack.display();
    }

}
