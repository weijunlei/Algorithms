package lc_148_sortList;

class Solution2 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode pre = head.next;
        ListNode middle = head;
        while (pre != null && pre.next != null){
            pre = pre.next.next;
            middle = middle.next;
        }

        pre = middle.next;
        middle.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(pre);

        ListNode result = new ListNode(0);
        ListNode temp = result;
        while (left != null && right != null){
            if (left.val < right.val){
                temp.next = left;
                left = left.next;
            }else{
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        temp.next = right;
        if (left != null){
            temp.next = left;
        }

        return result.next;
    }
}
