package lc_239_maxSlidingWindow;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0){
            return nums;
        }

        PriorityQueue<Integer> pq = new  PriorityQueue<Integer>(Collections.reverseOrder());
        int[] result = new int[nums.length - k + 1];

        for(int i = 0; i < nums.length; i++){
            if (i >= k) pq.remove(nums[i - k]);
            pq.offer(nums[i]);
            if (i + 1 >= k) result[i + 1 - k] = pq.peek();
        }

        return result;
    }
}
