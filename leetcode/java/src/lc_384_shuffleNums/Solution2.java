package lc_384_shuffleNums;

import java.util.Random;

class Solution2 {
    private int[] nums;
    private int[] origins;

    private Random rand = new Random();

    public Solution2(int[] nums) {
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
        for(int i = 0; i < this.nums.length; i++){
            int swapIndex = rand.nextInt(this.nums.length - i) + i;
            int temp = this.nums[i];
            this.nums[i] = this.nums[swapIndex];
            this.nums[swapIndex] = temp;
        }
        return this.nums;
    }
}
