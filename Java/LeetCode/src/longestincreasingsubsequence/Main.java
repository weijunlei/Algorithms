package longestincreasingsubsequence;

/**
 * @author : Qingfeng
 * @date : 2018/6/24
 */
public class Main {
    public static void main(String[] args){
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
        int[] nums = {10,9,2,5,3,7,101,18};

        System.out.println(longestIncreasingSubsequence.lengthOfLIS(nums));
    }
}
