package lc_334_increasingTriplet;

class Solution2 {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3){
            return false;
        }
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for(int num: nums){
            if (num <= max1){
                max1 = num;
            } else if (num <= max2){
                max2 = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
