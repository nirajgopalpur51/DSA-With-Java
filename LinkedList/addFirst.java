package LinkedList;

public class addFirst {
    public static Node<Integer> head ;
    public static Node<Integer> tail;
    
    public static void add(int data){
        Node<Integer> newNode=new Node<>(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    public static void print(Node<Integer> head){
        while(head != null){
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        add(12);
        add(12);
        add(120);
        print(head);

    }
}
