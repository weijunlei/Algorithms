package lc_202_isHappy;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        if (n <= 0){
            return false;
        }
        Set<Integer> intSet = new HashSet<Integer>();
        while (n != 1 && !intSet.contains(n)){
            intSet.add(n);
            n = getHappy(n);
        }
        return n == 1;
    }

    private int getHappy(int n){
        int result = 0;
        int tempNum = 0;
        while (n != 0){
            tempNum = n % 10;
            result += tempNum * tempNum;
            n /= 10;
        }
        return result;
    }
}
