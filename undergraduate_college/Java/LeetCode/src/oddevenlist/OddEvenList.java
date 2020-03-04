package oddevenlist;


/**
 * @author : Qingfeng
 * @date : 2018/8/11
 */
public class OddEvenList {
    public ListNode oddEvenList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode oddNode = new ListNode(0);
        ListNode evenNode = new ListNode(0);
        ListNode l1 = oddNode;
        ListNode l2 = evenNode;

        boolean isOdd = true;
        while(head != null){
            if (isOdd){
                l1.next = head;
                l1 = l1.next;
            }else{
                l2.next = head;
                l2 = l2.next;
            }
            head = head.next;
            isOdd = !isOdd;
        }

        l2.next = null;
        l1.next = evenNode.next;

        return oddNode.next;
    }
}
