package reverselist;

/**
 * @author : Qingfeng
 * @date : 2018/6/4
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = null;
        ListNode current = head;

        while (head != null) {
            current = head.next;
            head.next = pre;
            pre = head;
            head = current;
        }

        return pre;
    }
}
