package randomlistnodecopy;

public class Solution {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead == null)
            return null;
        RandomListNode pCur = pHead;
        while (pCur != null)
        {
            RandomListNode newRandomListNode = new RandomListNode(pCur.label);
            newRandomListNode.next = pCur.next;
            pCur.next = newRandomListNode;
            pCur = pCur.next.next;
        }

        pCur = pHead;
        while (pCur != null)
        {
            if (pCur.random != null)
                pCur.next.random = pCur.random.next;
            pCur = pCur.next.next;
        }

        RandomListNode resultHead = pHead.next;
        RandomListNode cur = resultHead;
        pCur = pHead;

        while (cur != null)
        {
            pCur.next = pCur.next.next;
            if (cur.next != null)
                cur.next = cur.next.next;
            cur = cur.next;
            pCur = pCur.next;
        }

        return resultHead;
    }
}
