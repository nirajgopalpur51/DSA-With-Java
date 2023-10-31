public class addMiddle {

    public static Node<Integer> head ;
    public static Node<Integer> tail;
    public static void add(int data){
        Node newNode=new Node(data);
        if(newNode==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public static void print(Node<Integer> head){
        while(head != null){
            System.out.print(head.data +" -> "); 
            head = head.next;
        }
        System.out.println(" null");
    }

    public static void add_last(int index,int data){
        if(index==0){
            add(data);
            return;
        }
        Node newNode=new Node(data);
        int i=0;
        Node temp=head;

        while (i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public static void last(int data){
        Node<Integer> newNode=new Node<>(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        if (tail == null) {
            // If tail is null, it means the list is empty, so we initialize tail.
            tail = newNode;
            head.next = tail;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void main(String[] args) {
        add(2);
        last(4);
        add(2);
        add(2);
        add_last(2,3);
        print(head);
    }
}
