package deleteduplication;

/**
 * @author : Qingfeng
 * @date : 2018/7/1
 */
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead){
        if (pHead == null){
            return pHead;
        }

        ListNode result = new ListNode(0);
        result.next = pHead;
        ListNode cur = pHead;
        ListNode pre = result;

        while(cur != null && cur.next != null){
            if (cur.val == cur.next.val){
                int curVal = cur.val;
                while(cur != null && cur.val == curVal){
                    cur = cur.next;
                }
                pre.next = cur;
            }
            else{
                pre = cur;
                cur = cur.next;
            }
        }

        return result.next;
    }
}
