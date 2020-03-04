package rotate;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 * 旋转数组
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/23/
 */
public class Rotate {
    public void rotate(int[] nums, int k){
        if (nums == null || nums.length == 0){
            return;
        }

        int[] copyNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            copyNums[i] = nums[i];
        }

        k = k % nums.length;

        for(int i = 0; i < nums.length; i++){
            nums[i] = copyNums[(i + nums.length - k) % nums.length];
        }
    }
}
