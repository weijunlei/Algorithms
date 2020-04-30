package lc_136_singleNumber;

class Solution {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int result = 0;
        for(int num:nums){
            result = result ^ num;
        }
        return result;
    }
}
