package reverselist;

/**
 * @author : Qingfeng
 * @date : 2018/6/5
 */
public class Main {
    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head = reverseList.reverseList(head);

        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }
    }
}
