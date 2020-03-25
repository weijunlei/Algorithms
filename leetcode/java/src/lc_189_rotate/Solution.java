package lc_189_rotate;

public class Solution {
    public void rotate(int[] nums, int k){
        k = k % nums.length;
        if (k == 0){
            return;
        }
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int startIndex, int endIndex){
        while(startIndex < endIndex){
            int temp = nums[startIndex];
            nums[startIndex++] = nums[endIndex];
            nums[endIndex--] = temp;
        }
    }
}
