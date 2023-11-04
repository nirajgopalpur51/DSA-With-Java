public class reverseLL {
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


   public static void reverse(){
        Node prev = null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
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
        add(2);
        add(9);
        last(45);
        last(5);
        last(50);
        last(5);
        print(head);
        reverse();
        print(head);
    }
}
