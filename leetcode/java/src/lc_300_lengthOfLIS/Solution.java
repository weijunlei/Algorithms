package lc_300_lengthOfLIS;

class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int result = 0;
        int dps[] = new int[nums.length];
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if (nums[i] > nums[j]){
                    dps[i] = Math.max(dps[j] + 1, dps[i]);
                    if (result < dps[i]){
                        result = dps[i];
                    }
                }
            }
        }
        return result + 1;
    }
}
