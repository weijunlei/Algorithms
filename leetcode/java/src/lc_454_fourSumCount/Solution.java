package lc_454_fourSumCount;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        if (A == null || A.length == 0 || B == null || B.length == 0 || C == null || C.length == 0 || D == null || D.length == 0){
            return 0;
        }
        Map<Integer, Integer> dictAB = new HashMap<>();
        int result = 0;
        for (int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                int tempSum = A[i] + B[j];
                if (!dictAB.containsKey(tempSum)){
                    dictAB.put(tempSum, 1);
                }else{
                    dictAB.put(A[i] + B[j], dictAB.get(tempSum) + 1);
                }
            }
        }

        for(int i = 0; i < C.length; i++){
            for(int j = 0; j < D.length; j++){
                int tempSum = C[i] + D[j];
                if (dictAB.containsKey(-tempSum)){
                    result += dictAB.get(-tempSum);
                }
            }
        }
        return result;
    }
}
