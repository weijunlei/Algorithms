package lc_125_isPalindrome;

class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        s = s.toLowerCase();

        int low_index = 0;
        int high_index= s.length() - 1;
        boolean result = true;
        while (true) {
            while (high_index > low_index  && !isAlpha(s.charAt(low_index))) {
                low_index ++;
            }
            while (high_index > low_index && !isAlpha(s.charAt(high_index))) {
                high_index --;
            }
            if (high_index <= low_index) {
                break;
            }
            else if (high_index > low_index && isAlpha(s.charAt(low_index)) && isAlpha(s.charAt(high_index)) && s.charAt(high_index) != s.charAt(low_index)) {
                result = false;
                break;
            }
            else{
                high_index --;
                low_index++;
            }
        }
        return result;
    }

    private boolean isAlpha(char ch) {
        if ((ch >= '0' && ch <= '9') || (ch  >= 'a' && ch <= 'z')) {
            return true;
        } else{
            return false;
        }
    }
}
