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

        ListNode pre = pHead;
        ListNode temp = pHead;
        ListNode result = null;
        while(pre != null){
            while(temp.val == pre.val){
                temp = temp.next;
            }

        }
    }
}
