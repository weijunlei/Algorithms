package ZNumOfOne;

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int result = 0;
        int high = n, low = 0, cur = 0;
        int i=1;
        while (high != 0)
        {
            high = n / (int) Math.pow(10, i);
            int temp = n % (int)Math.pow(10, i);
            low = temp % (int) Math.pow(10, i-1);
            cur = temp / (int) Math.pow(10, i - 1);
            if (cur == 1)
                result += high * (int)Math.pow(10 , i-1) + low + 1;
            else if (cur == 0)
                result += high * (int)Math.pow(10 , i - 1);
            else
                result += (high + 1) * (int)Math.pow(10 , i - 1);
            i ++;
        }
        return result;
    }
}
