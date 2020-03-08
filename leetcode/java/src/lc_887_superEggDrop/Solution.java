package lc_887_superEggDrop;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int superEggDrop(int K, int N) {
        return eggDropHelper(K, N);
    }

    private static Map<String, Integer> eggDPs = new HashMap();

    private String hasHelper(int K, int N) {
        return Integer.toString(K) + "," + Integer.toString(N);
    }

    private int eggDropHelper(int K, int N) {
        if (!eggDPs.containsKey(hasHelper(K, N))) {
            int result = 0;
            if (K == 1 || N == 0 || N == 1) {
                result = N;
            } else {
                int low = 1;
                int high = N;
                while (low + 1 < high) {
                    int mid = (low + high) / 2;
                    int r1 = eggDropHelper(K, N - mid);
                    int r2 = eggDropHelper(K - 1, mid - 1);

                    if (r1 > r2) {
                        low = mid;
                    } else if (r1 < r2) {
                        high = mid;
                    } else {
                        low = high = mid;
                    }
                }
                result = 1 + Math.min(Math.max(eggDropHelper(K, N - low), eggDropHelper(K - 1, low - 1)),
                        Math.max(eggDropHelper(K, N-high), eggDropHelper(K - 1, high - 1)));
            }
            eggDPs.put(hasHelper(K, N), result);
        }
        return eggDPs.get(hasHelper(K, N));
    }
}
