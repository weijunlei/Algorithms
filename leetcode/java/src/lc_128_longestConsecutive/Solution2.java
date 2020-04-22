package lc_128_longestConsecutive;

import java.util.HashSet;

class Solution2 {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int result = 1;
        int temp = 1;

        HashSet<Integer> numSet = new HashSet<>();
        for(int num: nums){
            numSet.add(num);
        }

        for(int num: nums){
            if (!numSet.contains(num - 1)){
                temp = 1;
                while (numSet.contains(num + 1)){
                    temp += 1;
                    num ++;
                }
                if (temp > result){
                    result = temp;
                }
            }
        }
        return result;
    }
}
