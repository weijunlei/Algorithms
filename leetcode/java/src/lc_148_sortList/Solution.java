package lc_148_sortList;

class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        quickSort(head, null);

        return head;
    }

    private void quickSort(ListNode head, ListNode end){
        if (head != end){
            ListNode midNode = getPartition(head, end);
            quickSort(head, midNode);
            quickSort(midNode.next, end);
        }
    }

    private ListNode getPartition(ListNode head, ListNode end){
        ListNode getNode = head;
        int getNum = head.val;
        ListNode pre = head.next;

        while(pre != null){
            if (pre == end){
                break;
            }
            if (pre.val < getNum){
                getNode = getNode.next;
                int tempNum = pre.val;
                pre.val = getNode.val;
                getNode.val = tempNum;
            }
            pre = pre.next;
        }

        int tempNum = getNode.val;
        getNode.val = head.val;
        head.val = tempNum;

        return getNode;
    }
}
