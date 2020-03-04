package longestincreasingsubsequence;

/**
 * @author : Qingfeng
 * @date : 2018/6/24
 */
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums){
        if (nums == null || nums.length == 0){
            return 0;
        }
        int[] longestList = new int[nums.length];
        int result = 1;
        for(int i = 0; i < nums.length; i++){
            int tempResult = 1;
            for(int j = 0; j < i; j++){
                if (nums[j] < nums[i] && longestList[j] + 1 > tempResult){
                    tempResult = longestList[j] + 1;
                }
            }
            longestList[i] = tempResult;
            if (tempResult > result){
                result = tempResult;
            }
        }

        return result;
    }
}
