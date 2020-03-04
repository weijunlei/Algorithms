package findkth2tail;

/**
 * @author : Qingfeng
 * @date : 2018/6/4
 */
public class Main {
    public static void main(String[] args) {
        FindKth2Tail findKth2Tail = new FindKth2Tail();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print(findKth2Tail.findKthToTail(head, 5).val);
    }
}
