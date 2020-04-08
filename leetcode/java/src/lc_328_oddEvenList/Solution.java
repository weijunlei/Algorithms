package lc_328_oddEvenList;

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode even = head.next;
        ListNode evenPre = even;
        ListNode oddEnd = head;

        while(evenPre != null && evenPre.next != null){
            oddEnd.next = evenPre.next;
            oddEnd = oddEnd.next;
            evenPre.next = oddEnd.next;
            evenPre = evenPre.next;
        }

        oddEnd.next = even;
        return head;
    }
}
