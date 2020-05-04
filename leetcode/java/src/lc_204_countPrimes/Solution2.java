package lc_204_countPrimes;

class Solution2 {
    public int countPrimes(int n) {
        if (n == 0 || n == 1){
            return 0;
        }
        int result = n;
        int[] dps = new int[n];
        for(int i = 2; i * i < n; i++){
            for(int j = i * i; j < n; j += i){
                if (dps[j] == 1){
                    continue;
                }
                dps[j] = 1;
                result -= 1;
            }
        }
        return result - 2;
    }
}
