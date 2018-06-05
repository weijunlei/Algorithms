package mergetwolist;

/**
 * @author : Qingfeng
 * @date : 2018/6/5
 */
public class Main {
    public static void main(String[] args) {
        Merge merge = new Merge();
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(0);

        ListNode pre1 = list1;
        ListNode pre2 = list2;

        for (int i = 0; i < 5; i ++) {
            pre1.next = new ListNode(i);
            pre1 = pre1.next;
        }

        for (int i = 0; i < 10;) {
            pre2.next = new ListNode(i);
            pre2 = pre2.next;
            i = i + 2;
        }

        pre1 = merge.merge(list1, list2);
        while (pre1 != null) {
            System.out.println(pre1.val);
            pre1 = pre1.next;
        }
    }
}
