package lc_198_rob;

class Solution2 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int pre = 0;
        int cur = 0;
        for(int num: nums){
            int temp = cur;
            cur = Math.max(cur, num + pre);
            pre = temp;
        }

        return cur;
    }
}
