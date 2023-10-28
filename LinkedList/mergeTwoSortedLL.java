package LinkedList;

import java.util.Scanner;

public class mergeTwoSortedLL {

    public static Node<Integer> takeInput()
    {
        Node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<Integer>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode; // tail = tail.next
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){
        while(head != null){
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> t1 = head1, t2 = head2;
        Node<Integer> head = null, tail = null;
        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        if (t1 != null) {
            tail.next = t1;
        } else {
            tail.next = t2;
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head1 =takeInput();
        Node<Integer> head2 =takeInput();
        Node<Integer> head= merge(head1,head2);
        print(head);

    }
}
