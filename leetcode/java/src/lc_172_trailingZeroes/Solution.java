package lc_172_trailingZeroes;

class Solution {
    public int trailingZeroes(int n) {
        if (n < 0){
            return -1;
        }
        int result = 0;
        while (n / 5 != 0){
            result += n / 5;
            n = n / 5;
        }
        return result;
    }
}
