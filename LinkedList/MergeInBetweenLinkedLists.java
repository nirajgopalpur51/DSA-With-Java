
import java.util.*;

public class MergeInBetweenLinkedLists {
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prevNodeA = list1;
        ListNode nodeB = list1;

        // Find the node just before the sublist to be removed
        for(int index = 0; index < b; index++) {
            if(index == a - 1) {
                prevNodeA = nodeB;
            }
            nodeB = nodeB.next;
        }

        // Find the end of list2
        ListNode list2End = list2;
        while(list2End.next != null) {
            list2End = list2End.next;
        }

        // Connect prevNodeA to list2
        prevNodeA.next = list2;

        // Connect the end of list2 to nodeB.next
        list2End.next = nodeB.next;

        // Disconnect the sublist from list1
        nodeB.next = null;

        return list1;
    }
}
