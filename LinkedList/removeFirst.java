package LinkedList;

public class removeFirst {
    public static Node<Integer> head ;
    public static Node<Integer> tail;
    public static int size;

    public static void add(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public static void last(int data){
        Node<Integer> newNode=new Node<>(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static int remove_First(){

        if(size==0){
            System.out.println("LL is empty");
        } else if (size==1) {
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        size++;
        return val;
    }

    public static void print(Node<Integer> head){
        while(head != null){
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        add(23);
        add(23);
        add(23);
        last(45);
        last(45);
        last(45);
        last(45);
        remove_First();
        print(head);
    }
}
