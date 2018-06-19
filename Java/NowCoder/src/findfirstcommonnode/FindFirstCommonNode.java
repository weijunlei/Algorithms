package findfirstcommonnode;

/**
 * @author : Qingfeng
 * @date : 2018/6/19
 */
public class FindFirstCommonNode {
    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }

        int list1Length = 0;
        int list2Length = 0;
        ListNode pre1 = pHead1;
        ListNode pre2 = pHead2;

        while (pre1 != null) {
            list1Length ++;
            pre1 = pre1.next;
        }

        while (pre2 != null) {
            list2Length ++;
            pre2 = pre2.next;
        }

        pre1 = pHead1;
        pre2 = pHead2;

        if (list1Length > list2Length) {
            for (int i = 0; i < list1Length - list2Length; i++) {
                pre1 = pre1.next;
            }
        }
        else
        {
            for (int i = 0; i < list2Length - list1Length; i++) {
                pre2 = pre2.next;
            }
        }

        while (pre1 != null) {
            if (pre1 == pre2){
                return pre1;
            }
            pre1 = pre1.next;
            pre2 = pre2.next;
        }
        return null;
    }
}
