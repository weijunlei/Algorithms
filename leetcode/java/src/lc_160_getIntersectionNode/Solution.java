package lc_160_getIntersectionNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if ((headA == null && headB != null) || (headA != null && headB == null)){
            return null;
        }
        int countA = 0, countB = 0;
        ListNode preA = headA, preB = headB;
        while (preA != null){
            preA = preA.next;
            countA += 1;
        }
        while (preB != null){
            preB = preB.next;
            countB += 1;
        }
        preA = headA;
        preB = headB;
        while(countA > countB){
            preA = preA.next;
            countA--;
        }
        while(countA < countB){
            preB = preB.next;
            countB--;
        }

        while(preA != null){
            if (preA == preB){
                return preA;
            }
            preA = preA.next;
            preB = preB.next;
        }
        return null;
    }
}
