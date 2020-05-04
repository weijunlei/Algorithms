package lc_204_countPrimes;

class Solution {
    public int countPrimes(int n) {
        if (n == 0 || n == 1){
            return 0;
        }
        int result = n;
        int[] dps = new int[n];
        for(int i = 2; i < n; i++){
            for(int j = 2; j*i < n; j++){
                if (dps[i * j] == 1){
                    continue;
                }
                dps[i * j] = 1;
                result -= 1;
            }
        }
        return result - 2;
    }
}
