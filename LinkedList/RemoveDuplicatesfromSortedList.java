package LinkedList;

public class RemoveDuplicatesfromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode prev = head;
        ListNode temp = (head != null) ? head.next : null;

        while (temp != null) {
            if (temp.val == prev.val) {
                prev.next = null; // Set next to null to skip duplicates
                temp = temp.next;
                continue;
            }

            prev.next = temp;
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
    public static void print(ListNode head){
        while(head != null){
            System.out.print(head.val +" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(5);
        list.next=new ListNode(6);
        list.next.next=new ListNode(7);
        list.next.next.next=new ListNode();
        deleteDuplicates(list);

        print(list);

    }
}
