package lc_206_reverseList;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode now = head;
        ListNode forward = head.next;

        while(now != null){
            now.next = pre;
            pre = now;
            now = forward;
            if (forward != null){
                forward = forward.next;
            }
        }
        return pre;
    }
}
