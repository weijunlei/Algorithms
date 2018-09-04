package deletenode;

/**
 * @author : Qingfeng
 * @date : 2018/9/4
 * 删除链表中的节点
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/41/
 */
public class DeleteNode {
    public void deleteNode(ListNode node){
        if (node == null || node.next == null){
            return;
        }

        node.val = node.next.val;
        node.next = node.next.next;
    }
}
