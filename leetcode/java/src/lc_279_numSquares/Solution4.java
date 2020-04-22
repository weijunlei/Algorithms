package lc_279_numSquares;

class Solution4 {
    public int numSquares(int n) {
        while (n % 4 == 0){
            n /= 4;
        }
        if (n % 8 == 7){
            return 4;
        }
        if (isSquare(n)){
            return 1;
        }
        for(int i = 1; i * i <= n; i++){
            if (isSquare(n - i * i)){
                return 2;
            }
        }
        return 3;
    }

    private boolean isSquare(int n){
        int getSqrt = (int)Math.sqrt(n);
        return getSqrt * getSqrt == n;
    }
}
