package lc_234_isPalindrome;

class Solution2 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode pre = null;
        ListNode forward = slow.next;
        while(slow != null){
            slow.next = pre;
            pre = slow;
            slow = forward;
            if (forward != null){
                forward = forward.next;
            }
        }
        forward = head;
        while(pre != null){
            if (forward.val != pre.val){
                return false;
            }
            pre = pre.next;
            forward = forward.next;
        }
        return true;
    }
}
