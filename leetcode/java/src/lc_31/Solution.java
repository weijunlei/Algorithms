package lc_31;

public class Solution {
    public void nextPermutation(int[] nums){
        if (nums == null || nums.length <= 1){
            return;
        }

        int n = nums.length;
        int index = n - 1;
        while (index > 0){
            if (nums[index] <= nums[index - 1]){
                index -= 1;
            }else{
                break;
            }
        }
        if (index == 0){
            reverse(nums, 0, n - 1);
            return;
        }
        int moreIdx = n - 1;
        while(moreIdx >= index){
            if (nums[moreIdx] > nums[index - 1]){
                break;
            }
            moreIdx -= 1;
        }
        swap(nums, moreIdx, index - 1);
        reverse(nums, index, n - 1);
    }

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void reverse(int[] nums, int left, int right){
        while (left < right){
            swap(nums, left, right);
            left += 1;
            right -= 1;
        }
    }
}
