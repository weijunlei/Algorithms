package addtwonumbers;

/**
 * @author : Qingfeng
 * @date : 2018/8/11
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode result = new ListNode(0);
        ListNode pre = result;
        if (l1 == null && l2 == null){
            return result.next;
        }
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        int carry = 0;
        int tempNum = 0;

        while(l1 != null && l2 != null){
            tempNum = l1.val + l2.val + carry;
            pre.next = new ListNode(tempNum % 10);
            pre = pre.next;
            carry = tempNum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            tempNum = l1.val + carry;
            pre.next = new ListNode(tempNum % 10);
            pre = pre.next;
            carry = tempNum / 10;
            l1 = l1.next;
        }

        while(l2 != null){
            tempNum = l2.val + carry;
            pre.next = new ListNode(tempNum % 10);
            pre = pre.next;
            carry = tempNum / 10;
            l2 = l2.next;
        }

        if (carry != 0){
            pre.next = new ListNode(carry);
        }

        return result.next;
    }
}
