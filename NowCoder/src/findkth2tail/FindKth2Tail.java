package findkth2tail;

/**
 * @author : Qingfeng
 * @date : 2018/6/4
 */
public class FindKth2Tail {
    public ListNode findKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode pre = head;
        ListNode result = head;
        int count = 1;

        while (pre != null) {
            pre = pre.next;
            if (count > k) {
                result = result.next;
            }
            count ++;
        }

        return count >= k ? result : null;
    }
}
