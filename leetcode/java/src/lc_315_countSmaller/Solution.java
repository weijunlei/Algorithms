package lc_315_countSmaller;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> countSmaller(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] > nums[j]){
                    count += 1;
                }
            }
            result.add(count);
        }
        return result;
    }
}
