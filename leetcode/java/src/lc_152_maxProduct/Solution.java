package lc_152_maxProduct;

class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int maxNum = 1;
        int minNum = 1;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] < 0){
                maxNum = maxNum + minNum;
                minNum = maxNum - minNum;
                maxNum = maxNum - minNum;
            }
            maxNum = nums[i] > maxNum * nums[i] ? nums[i]: maxNum * nums[i];
            minNum = nums[i] < minNum * nums[i] ? nums[i]: minNum * nums[i];
            if(result < maxNum){
                result = maxNum;
            }
        }
        return result;
    }
}
