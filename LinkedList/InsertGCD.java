public class InsertGCD {
    static int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        if(head==null || head.next==null) return head;
        ListNode t = head;


        while(t.next!=null){
            ListNode x = t.next;
            int a = gcd(t.val, x.val);
            t.next = new ListNode(a);
            t=t.next;
            t.next = x;
            t=t.next;
        }
        return head;
    }
}
