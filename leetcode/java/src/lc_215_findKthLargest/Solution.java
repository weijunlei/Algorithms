package lc_215_findKthLargest;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length < k){
            return -1;
        }
        int result = -1;
        int start = 0;
        int end = nums.length - 1;
        result = getIndex(nums, start, end);
        while (result != k - 1){
            if (result > k - 1){
                end = result;
                result = getIndex(nums, start, end - 1);
            } else if(result < k - 1){
                start = result;
                result = getIndex(nums, start + 1, end);
            }
        }
        if (result == k - 1){
            return nums[k - 1];
        }else {
            return -1;
        }
    }

    private int getIndex(int[] nums, int s, int e){
        int getNum = nums[s];
        int getIndex = s;
        swap(nums, s, e);

        for(int i = s; i < e; i++){
            if (nums[i] > getNum){
                swap(nums, getIndex, i);
                getIndex ++;
            }
        }
        swap(nums, getIndex, e);
        return getIndex;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
