package dividendanddivisor;

/**
 * @author : Qingfeng
 * @date : 2018/8/30
 * 两数相除
 */
public class DividendAndDivisor {
    public int divide(int dividend, int divisor){
        long absDividend = Math.abs((long)dividend);
        long absDivisor = Math.abs((long)divisor);

        if (absDividend < absDivisor) return 0;
        if (divisor == 0) return dividend > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        if (dividend == Integer.MIN_VALUE && (divisor == -1 || divisor == 1)){
            return divisor == 1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        long result = 0;

        while (absDividend >= absDivisor){
            long tempDivisor = absDivisor;
            long tempCount = 1;
            while (absDividend >= (tempDivisor << 1)){
                tempDivisor = tempDivisor << 1;
                tempCount = tempCount << 1;
            }

            absDividend -= tempDivisor;
            result += tempCount;
        }

        return (dividend > 0 ^ divisor > 0) ? -(int)result : (int)result;
    }
}
