package lc_283_moveZeros;

class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }
        int notZeroIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[notZeroIndex++] = nums[i];
            }
        }
        for(int i = notZeroIndex; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
