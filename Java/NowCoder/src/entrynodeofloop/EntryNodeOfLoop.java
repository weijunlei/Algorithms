package entrynodeofloop;

/**
 * @author : Qingfeng
 * @date : 2018/6/30
 */
public class EntryNodeOfLoop {
    public ListNode entryNodeOfLoop(ListNode pHead){
        if (pHead == null || pHead.next == null){
            return pHead;
        }

        ListNode fastNode = pHead;
        ListNode slowNode = pHead;
        ListNode result = new ListNode(0);

        do {
            if (fastNode == null || fastNode.next == null)
            {
                return result.next;
            }
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        while(fastNode != slowNode);

        fastNode = pHead;
        while(fastNode != slowNode){
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }

        return fastNode;
    }
}
