package ZprintListFromTailToHead;

import AddTwoNumbers.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Solution {
    public class ListNode
    {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> tailToHeadList = new ArrayList<>();
        Stack<Integer> tempStack = new Stack<>();

        while (listNode != null)
        {
            tempStack.push(listNode.val);
            listNode = listNode.next;
        }

        while (!tempStack.isEmpty())
            tailToHeadList.add(tempStack.pop());
        return tailToHeadList;
    }
}
