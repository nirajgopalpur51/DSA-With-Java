
import DSA.testing;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
         head.next = new ListNode(4);
         head.next.next = new ListNode(5);
         head.next.next.next = head;


        System.out.println(  hasCycle(head));

    }
}
