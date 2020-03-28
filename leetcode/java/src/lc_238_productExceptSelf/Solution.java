package lc_238_productExceptSelf;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < result.length; i++){
            result[i] = 1;
        }
        int tempResult = 1;
        for(int i = 0; i < result.length - 1; i++){
            tempResult *= nums[i];
            result[i+1] *= tempResult;
        }
        tempResult = 1;
        for(int i = result.length - 1; i > 0; i--){
            tempResult *= nums[i];
            result[i - 1] *= tempResult;
        }
        return result;
    }
}
