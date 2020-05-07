package lc_326_isPowerOfThree;

class Solution2 {
    public boolean isPowerOfThree(int n) {
        if (n < 1){
            return false;
        }
        return Integer.toString(n, 3).matches("^10*$");
    }
}
