package lc_169_majority_element;

public class Solution {
    public int majorityElement(int[] nums) {
        Integer result = null;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                result = nums[i];
            }
            count += result == nums[i] ? 1 : -1;
        }
        return result;
    }
}
