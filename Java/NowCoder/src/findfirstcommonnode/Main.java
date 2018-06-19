package findfirstcommonnode;

/**
 * @author : Qingfeng
 * @date : 2018/6/19
 * Question Description:
 */
public class Main {
    public static void main(String[] args) {
        FindFirstCommonNode firstCommonNode = new FindFirstCommonNode();
        ListNode pHead1 = new ListNode(1);
        ListNode pHead2 = new ListNode(2);
        ListNode pHead3 = new ListNode(3);

        ListNode pre1 = pHead1;
        ListNode pre2 = pHead2;
        ListNode pre3 = pHead3;

        pre1.next = new ListNode(4);
        pre2.next = new ListNode(5);
        pre3.next = new ListNode(6);
        pre1 = pre1.next;
        pre2 = pre2.next;
        pre3 = pre3;

        pre1.next = pre3;
        pre2.next = pre3;

        ListNode pre4 = firstCommonNode.findFirstCommonNode(pHead1, pHead2);
        while (pre4 != null) {
            System.out.println(pre4.val);
            pre4 = pre4.next;
        }
    }
}
