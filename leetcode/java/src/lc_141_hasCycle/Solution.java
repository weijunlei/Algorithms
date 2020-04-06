package lc_141_hasCycle;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null){
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        do{
            slow = slow.next;
            fast = fast.next != null ? fast.next.next : null;
        }
        while (fast != null && slow != null && (fast != slow));
        if (fast == slow && fast != null){
            return true;
        }else{
            return false;
        }
    }
}
