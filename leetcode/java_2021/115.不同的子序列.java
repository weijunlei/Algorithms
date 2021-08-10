/*
 * @lc app=leetcode.cn id=115 lang=java
 *
 * [115] 不同的子序列
 */

// @lc code=start
class Solution {
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] dps = new int[m + 1][n + 1];
        for(int i = 0; i <= m; i++){
            dps[i][0] = 1;
        }

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if (s.charAt(i - 1) == t.charAt(j - 1)){
                    dps[i][j] = dps[i - 1][j - 1] + dps[i - 1][j];
                }else{
                    dps[i][j] = dps[i - 1][j];
                }
            }
        }
        return dps[m][n];
    }
}
// @lc code=end

