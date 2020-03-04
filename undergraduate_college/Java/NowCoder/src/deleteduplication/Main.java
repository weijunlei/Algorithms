package deleteduplication;

/**
 * @author : Qingfeng
 * @date : 2018/7/2
 */
public class Main {
    public static void main(String[] args){
        DeleteDuplication deleteDuplication = new DeleteDuplication();
        ListNode pHead = new ListNode(1);
        pHead.next = new ListNode(2);
        pHead.next.next = new ListNode(3);
        pHead.next.next.next = new ListNode(3);
        pHead.next.next.next.next = new ListNode(5);
        pHead.next.next.next.next.next = new ListNode(6);

        ListNode pre = deleteDuplication.deleteDuplication(pHead);

//        ListNode pre = pHead;
        while(pre != null){
            System.out.println(pre.val);
            pre = pre.next;
        }

        pre = pHead;
        while(pre != null){
            System.out.println(pre.val);
            pre = pre.next;
        }
    }
}
