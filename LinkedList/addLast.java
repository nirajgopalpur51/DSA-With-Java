public class addLast {
    public static Node<Integer> head ;
    public static Node<Integer> tail;

    public static void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public static void last(int data){
        Node<Integer> newNode=new Node<>(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
            tail.next = newNode;
            tail = newNode;
    }

    public static void print(Node<Integer> head){
        while(head != null){
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        add(5);
        last(120);
        last(1);
        last(12);
        print(head);
    }
}
