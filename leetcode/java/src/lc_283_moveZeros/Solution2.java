package lc_283_moveZeros;

class Solution2 {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }
        int notZeroIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                swap(nums, i, notZeroIndex++);
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        if (i == j){
            return;
        }
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
}
