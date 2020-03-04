package permute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Qingfeng
 * @date : 2018/8/18
 */
public class Permutation {
    public List<List<Integer>> permutation(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0){
            return result;
        }
        Arrays.sort(nums);
        ArrayList<Integer> tempResult = new ArrayList<>();
        backTracking(nums, result, tempResult);
        return result;
    }

    private void backTracking(int[] nums, List<List<Integer>> result, ArrayList<Integer> tempResult){
        if (tempResult.size() == nums.length){
            result.add(new ArrayList<>(tempResult));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if (tempResult.contains(nums[i])) {
                continue;
            }
            tempResult.add(nums[i]);
            backTracking(nums, result, tempResult);
            tempResult.remove(tempResult.size() - 1);

        }
    }
}
