package lc_384_shuffleNums;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Solution {
    private int[] nums;
    private int[] origins;

    private Random rand = new Random();

    public Solution(int[] nums) {
        this.nums = nums;
        origins = this.nums.clone();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        this.nums = this.origins;
        this.origins = this.origins.clone();
        return this.nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        List<Integer> copyList = new ArrayList<>();
        for(int num: this.nums){
            copyList.add(num);
        }
        for(int i = 0; i < this.nums.length; i++){
            int removeIndex = rand.nextInt(copyList.size());
            this.nums[i] = copyList.get(removeIndex);
            copyList.remove(removeIndex);
        }
        return this.nums;
    }
}
