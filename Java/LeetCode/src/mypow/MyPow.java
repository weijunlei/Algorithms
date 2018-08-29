package mypow;

/**
 * @author : Qingfeng
 * @date : 2018/8/29
 */
public class MyPow {
    public double myPow(double x, int n) {
        if (n == 0){
            return 1.0;
        }

        if (n < 0){
            x = 1 / x;
            n = -n;
        }
        double result = 1;
        double multipleX = x;

        // 关注最小整数的绝对值大于最大整数的最大值
        if (n == Integer.MIN_VALUE){
            n = Integer.MAX_VALUE;
            result = x;
        }
        while (n != 0){
            if (n % 2 == 1){
                result *= multipleX;
            }
            n /= 2;
            multipleX *= multipleX;
        }

        return result;
    }
}
