package lengthOfLongestSubString;

/**
 * @author : Qingfeng
 * @date : 2018/7/19
 * LeetCode:无重复字符的最长子串
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/29/array-and-strings/78/
 */
public class LengthOfLongestSubString {
    public int lengthOfLongestSubString(String s){
        if (s == null || s.length() == 0){
            return 0;
        }

        char[] chs = s.toCharArray();
        int strLength = s.length();
        int leftIndex = 0;
        int[] dps = new int[strLength];
        int maxResult = 0;
        int j;

        dps[0] = 1;
        for(int i = 1; i < strLength; i++){
            for(j = i - 1; j >= leftIndex; j--){
                if (chs[j] == chs[i]){
                    leftIndex = j + 1;
                    dps[i] = i - j;
                    break;
                }
                if (j == leftIndex){
                    dps[i] = dps[i - 1] + 1;
                }
            }
            if (dps[i] > maxResult){
                maxResult = dps[i];
            }

        }

        return maxResult;
    }
}
