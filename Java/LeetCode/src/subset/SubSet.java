package subset;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Qingfeng
 * @date : 2018/8/19
 * 题目：子集
 * 题目链接：https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/49/backtracking/94/
 */
public class SubSet {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        if (nums == null || nums.length == 0){
            return result;
        }

        // 核心思路：每次遍历结果集将下一个数加入结果集的每个结果中加入到结果集中
        for(int i = 0; i < nums.length; i++){
            int resultSize = result.size();
            for(int j = 0; j < resultSize; j++){
                ArrayList<Integer> tempList = new ArrayList<>(result.get(j));
                tempList.add(nums[i]);
                result.add(tempList);
            }
        }

        return result;
    }
}
