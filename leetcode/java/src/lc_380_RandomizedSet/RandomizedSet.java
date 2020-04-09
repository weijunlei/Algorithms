package lc_380_RandomizedSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

class RandomizedSet {

    /** Initialize your data structure here. */
    private HashMap<Integer, Integer> numMap;
    private List<Integer> nums;
    private Random random;

    public RandomizedSet() {
        numMap = new HashMap<>();
        nums = new ArrayList<>();
        random = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (numMap.containsKey(val)){
            return false;
        }
        numMap.put(val, nums.size());
        nums.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!numMap.containsKey(val)){
            return false;
        }
        int getIndex = numMap.get(val);
        int getNum = nums.get(nums.size() - 1);
        numMap.put(getNum, getIndex);
        nums.set(getIndex, getNum);
        nums.remove(nums.size() - 1);
        numMap.remove(val);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
