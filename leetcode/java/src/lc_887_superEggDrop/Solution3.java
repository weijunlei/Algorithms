package lc_887_superEggDrop;

public class Solution3 {
    public int superEggDrop(int K, int N) {
        int low = 1;
        int high = N;
        while (low < high) {
            int mid = (low + high) / 2;
            if (eggHelper(mid, K, N) < N) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private int eggHelper(int mid, int K, int N) {
        int result = 0;
        int r = 1;
        for (int i = 1; i <= K; i++) {
            r *= mid - i + 1;
            r /= i;
            result += r;
            if (result > N) break;
        }
        return result;
    }
}
