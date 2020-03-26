package lc_217_containDuplicate;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0){
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if (set.contains(num)){
                return true;
            } else{
                set.add(num);
            }
        }
        return false;
    }
}
