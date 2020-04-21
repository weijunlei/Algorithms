package lc_395_longestSubstring;

class Solution {
    public int longestSubstring(String s, int k) {
        if (s == null || s.length() == 0 || k > s.length()){
            return 0;
        }
        if (k < 2){
            return s.length();
        }

        return subStringHelper(s, 0, s.length() - 1, k);
    }


    private int subStringHelper(String s, int start, int end, int k){
        if (end - start + 1 < k){
            return 0;
        }

        int[] chNum = new int[26];
        for(int i = start; i <= end; i++){
            chNum[s.charAt(i) - 'a'] += 1;
        }
        while(end - start + 1 >= k && chNum[s.charAt(start) - 'a'] < k){
            start++;
        }
        while(end - start + 1 >= k && chNum[s.charAt(end) - 'a'] < k){
            end--;
        }

        if (end - start + 1 < k){
            return 0;
        }
        for(int i = start; i <= end; i++){
            if (chNum[s.charAt(i) - 'a'] < k){
                return Math.max(subStringHelper(s, start, i - 1, k), subStringHelper(s, i + 1, end, k));
            }
        }
        return end - start + 1;
    }
}
