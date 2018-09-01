package siglenumber;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 * 只出现一次的数字
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/25/
 */
public class SingleNumber {
    public int sigleNumber(int[] nums){
        if (nums == null || nums.length == 0){
            return -1;
        }

        int result = 0;
        int zeroCount = 0;

        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                zeroCount ++;
            }
            result ^= nums[i];
        }

        if (result == 0 && zeroCount == 1){
            return -1;
        }

        return result;
    }
}
