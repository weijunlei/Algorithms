package isduplicate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 * 存在重复
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/24/
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
        if (nums == null || nums.length == 0){
            return false;
        }

        Set<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if (hashSet.contains(nums[i])){
                return true;
            }
            hashSet.add(nums[i]);
        }

        return false;
    }
}
