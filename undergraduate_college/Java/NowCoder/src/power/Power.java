package power;

/**
 * @author : Qingfeng
 * @date : 2018/6/4
 */
public class Power {
    public double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        double absExponent = exponent > 0 ? exponent : - exponent;
        double result = 1;
        for (int i = 0; i < absExponent; i ++) {
            result = result * base;
        }
        return exponent > 0 ? result : 1 / result;
    }
}
