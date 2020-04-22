package lc_279_numSquares;

import java.util.ArrayList;

class Solution {
    public int numSquares(int n) {
        if (n == 0 || n == 1){
            return 1;
        }
        int[] dps = new int[n + 1];
        ArrayList<Integer> sqrtNums = new ArrayList<>();
        for(int i = 0; i < n + 1; i++){
            if (i >= 1 && i * i <= n){
                sqrtNums.add(i * i);
            }
            dps[i] = i;
        }
        int sqrtSize = sqrtNums.size();
        for(int i = 2; i <= n; i++){
            int tempNum = 1;
            for(int j = 0; j < sqrtSize && i - sqrtNums.get(j) >= 0; j++){
                dps[i] = Math.min(dps[i], dps[i - sqrtNums.get(j)] + 1);
            }
        }
        return dps[n];
    }
}
