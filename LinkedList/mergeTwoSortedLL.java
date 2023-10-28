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
//        Node<Integer> list =new Node<Integer>(1);
//        Node<Integer> list1 =new Node<Integer>(2);
//        Node<Integer> list2 =new Node<Integer>(5);
//        Node<Integer> list3 =new Node<Integer>(8);
//        list.next=list1;
//        list1.next=list2;
//        list2.next=list3;
//        Node<Integer> one=list;
//
//        Node<Integer> node =new Node<Integer>(3);
//        Node<Integer> node1 =new Node<Integer>(6);
//        Node<Integer> node2 =new Node<Integer>(12);
//        Node<Integer> node3 =new Node<Integer>(15);
//        node.next=node1;
//        node1.next=node2;
//        node2.next=node3;
//        Node<Integer> two=node;

        Node<Integer> head1 =takeInput();
        Node<Integer> head2 =takeInput();
        Node<Integer> head= merge(head1,head2);
        print(head);

    }
}
