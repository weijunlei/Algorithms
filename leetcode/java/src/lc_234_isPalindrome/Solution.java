package lc_234_isPalindrome;

import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }
        ArrayList<Integer> getNums = new ArrayList<>();
        ListNode pre = head;
        while(pre != null){
            getNums.add(pre.val);
            pre = pre.next;
        }
        int arraySize = getNums.size();
        for(int i = 0; i < arraySize / 2; i++){
            if (!getNums.get(i).equals(getNums.get(arraySize - i - 1))){
                return false;
            }
        }
        return true;
    }
}
