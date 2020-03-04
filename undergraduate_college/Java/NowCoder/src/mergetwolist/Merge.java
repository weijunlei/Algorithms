package mergetwolist;

/**
 * @author : Qingfeng
 * @date : 2018/6/5
 */
public class Merge {
    public ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode result = new ListNode(0);
        ListNode pre = result;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                pre.next = list1;
                list1 = list1.next;
            }
            else {
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }

        if (list1 != null) {
            pre.next = list1;
        }

        if (list2 != null) {
            pre.next = list2;
        }

        return result.next;
    }
}
