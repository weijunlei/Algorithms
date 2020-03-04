package getintersectionnode;

/**
 * @author : Qingfeng
 * @date : 2018/8/11
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if (headA == null || headB == null){
            return null;
        }

        ListNode result = new ListNode(0);
        int listLength1 = 0;
        int listLength2 = 0;
        ListNode pre1 = headA;
        ListNode pre2 = headB;
        while(pre1 != null){
            listLength1 ++;
            pre1 = pre1.next;
        }

        while(pre2 != null){
            listLength2 ++;
            pre2 = pre2.next;
        }

        if (listLength1 > listLength2){
            for(int i = 0; i < listLength1 - listLength2; i++){
                headA = headA.next;
            }
        }
        else{
            for(int i = 0; i < listLength2 - listLength1; i++){
                headB = headB.next;
            }
        }

        pre1 = headA;
        pre2 = headB;

        while(pre1 != null && pre2 != null){
            if (pre1 == pre2){
                result.next = pre1;
                break;
            }
            pre1 = pre1.next;
            pre2 = pre2.next;
        }

        return result.next;
    }
}
