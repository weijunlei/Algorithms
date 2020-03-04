package removenthfromend;

/**
 * @author : Qingfeng
 * @date : 2018/9/4
 *  删除链表的倒数第N个节点
 *  https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/42/
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode result = new ListNode(0);

        if (head == null || n <= 0){
            return result.next;
        }

        ListNode preFast = head;
        ListNode preSlow = null;
        int nodeCount = 0;

        while (preFast != null){
            if (nodeCount >= n){
                if (preSlow == null){
                    preSlow = head;
                }else{
                    preSlow = preSlow.next;
                }
            }

            preFast = preFast.next;
            nodeCount++;
        }
        if (nodeCount >= n){
            if (preSlow == null){
                head = head.next;
            }else{
                preSlow.next = preSlow.next.next;
            }
            return head;
        }

        return result.next;
    }
}
