package twosum;

import java.util.HashMap;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 */
public class BetterTwoSum {
    public int[] twoSum(int[] nums, int target){
        int[] result = {-1, -1};
        if (nums == null || nums.length == 0){
            return result;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i <nums.length; i++){
            if (hashMap.containsKey(target - nums[i])){
                result[0] = hashMap.get(target - nums[i]);
                result[1] = i;
                break;
            }
            else{
                hashMap.put(nums[i], i);
            }
        }

        return result;
    }
}
