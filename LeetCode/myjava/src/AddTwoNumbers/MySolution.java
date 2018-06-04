package AddTwoNumbers;

public class MySolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
       if (l1 == null)
       {
           return l2;
       }

       if (l2 == null)
       {
           return l1;
       }

       ListNode result = new ListNode(0);
       ListNode pre = result;
       int carry = 0;

       while (l1 != null || l2 != null)
       {
           int val1 = 0;
           if (l1 != null)
           {
               val1 = l1.val;
               l1 = l1.next;
           }
           int val2 = 0;
           if (l2 != null)
           {
               val2 = l2.val;
               l2 = l2.next;
           }

           int temp_sum = val1 + val2 + carry;
           pre.next = new ListNode(temp_sum % 10);
           carry = temp_sum / 10;
           pre = pre.next;
       }

       if (carry == 1)
       {
           pre.next = new ListNode(1);
       }

       return result.next;
    }
}
