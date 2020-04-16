package lc_324_wiggleSort;

import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }
        Arrays.sort(nums);
        int mid = (nums.length + 1) / 2;
        reverse(nums, 0, mid - 1);
        reverse(nums, mid, nums.length - 1);
        int[] smallNums = new int[mid];
        int[] bigNums = new int[nums.length - mid];
        for(int i = 0; i < nums.length; i++){
            if (i <= mid - 1){
                smallNums[i] = nums[i];
            }else{
                bigNums[i - mid] = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++){
            if (i % 2 == 0){
                nums[i] = smallNums[i / 2];
            }else{
                nums[i] = bigNums[i / 2];
            }
        }
    }

    private void reverse(int[] nums,int start,int end){
        while (start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

}
