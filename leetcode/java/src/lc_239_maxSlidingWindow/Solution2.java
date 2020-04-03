package lc_239_maxSlidingWindow;

class Solution2 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0){
            return nums;
        }

        int n = nums.length;
        int[] leftDPs = new int[n];
        int[] rightDPs = new int[n];
        leftDPs[0] = nums[0];
        rightDPs[n - 1] = nums[n - 1];
        int[] result = new int[n - k + 1];

        for(int i = 1; i < n; i++){
            if (i % k != 0){
                leftDPs[i] = Math.max(nums[i], leftDPs[i - 1]);
            } else {
                leftDPs[i] = nums[i];
            }

            int rightIndex = n - i - 1;
            if (rightIndex % k != 0){
                rightDPs[rightIndex] = Math.max(nums[rightIndex], rightDPs[rightIndex + 1]);
            }else {
                rightDPs[rightIndex] = nums[rightIndex];
            }
        }
        for(int i = 0; i < n - k + 1; i++){
            result[i] = Math.max(rightDPs[i], leftDPs[i + k - 1]);
        }
        return result;
    }
}
