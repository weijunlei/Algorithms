package twosum;

import java.util.HashMap;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int[] result = {-1, -1};

        if (nums == null || nums.length == 0){
            return result;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            hashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            if (hashMap.containsKey(target - nums[i]) && i != hashMap.get(target - nums[i])){
                result[0] = i;
                result[1] = hashMap.get(target - nums[i]);
                break;
            }
        }

        return result;
    }
}
