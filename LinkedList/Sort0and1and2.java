public class Sort0and1and2 {
    static Node segregate(Node head) {
        // add your code here
        int zero = 0;
        int one = 0;
        int two = 0;
        Node current = head;
        Node temp = head;


        while(current!=null){
            if(current.data == 0){
                zero++;
                current = current.next;
            }
            else if(current.data == 1){
                one++;
                current = current.next;
            }
            else{
                two++;
                current = current.next;
            }
        }

        while(temp != null){
            if(zero>0){
                temp.data = 0;
                zero--;
                temp=temp.next;
            }
            else if(one>0){
                temp.data = 1;
                one--;
                temp=temp.next;
            }
            else if(two>0){
                temp.data = 2;
                two--;
                temp=temp.next;
            }
        }
        return head;
    }
}
