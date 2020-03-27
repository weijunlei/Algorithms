package lc_334_increasingTriplet;

class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3){
            return false;
        }
        int[] dps = new int[nums.length];
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if (nums[i] > nums[j]){
                    dps[i] = Math.max(dps[i], dps[j] + 1);
                    if (dps[i] == 2){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
