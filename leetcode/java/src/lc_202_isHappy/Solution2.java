package lc_202_isHappy;

class Solution2 {
    public boolean isHappy(int n) {
        if (n <= 0){
            return false;
        }
        int fast = getHappy(n);
        int slow = n;
        while (fast != 1 && slow != fast){
            fast = getHappy(getHappy(fast));
            slow = getHappy(slow);
        }
        return fast == 1;
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
