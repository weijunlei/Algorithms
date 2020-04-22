package lc_198_rob;

class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }

        int[] dps = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if (i < 2){
                dps[i] = nums[i];
            }else if(i == 2){
                dps[i] = nums[i] + nums[0];
            }else{
                dps[i] = nums[i] + Math.max(dps[i - 2], dps[i - 3]);
            }
        }

        return Math.max(dps[nums.length - 1], dps[nums.length - 2]);
    }
}
