package lc_128_longestConsecutive;

import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);
        int result = 1;
        int temp = 1;
        for(int i = 1; i < nums.length; i++){
            if (nums[i] - nums[i - 1] == 1){
                temp += 1;
                if (temp > result){
                    result = temp;
                }
            }else if(nums[i] != nums[i - 1]){
                temp = 1;
            }
        }

        return result;
    }
}
