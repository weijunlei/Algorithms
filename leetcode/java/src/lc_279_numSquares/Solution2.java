package lc_279_numSquares;

import java.util.HashSet;
import java.util.Set;

class Solution2 {
    private Set<Integer> squareSet;

    public int numSquares(int n) {
        if (n == 0 || n == 1){
            return 1;
        }
        squareSet = new HashSet<>();
        for(int i = 0; i * i <= n; i++){
            squareSet.add(i * i);
        }

        for(int i = 1; i <= n; i++){
            if (canSquare(n, i)){
                return i;
            }
        }
        return n;
    }

    private boolean canSquare(int n, int count){
        if (n < 0){
            return false;
        }
        if (count == 1){
            return squareSet.contains(n);
        }
        for(int num: squareSet){
            if (canSquare(n - num, count - 1)){
                return true;
            }
        }
        return false;
    }
}
