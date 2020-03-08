package lc_887_superEggDrop;

public class Solution2 {
    public int superEggDrop(int K, int N) {
        int ans = 0;
        int[] dps = new int[K + 1];
        for (int i = 0; i < K + 1; i ++) {
            dps[i] = 0;
        }
        while (dps[K] < N) {
            for(int i = K; i > 0; i--) {
                dps[i] = 1 + dps[i - 1] + dps[i];
            }
            ans ++;
        }
        return ans;
    }
}
