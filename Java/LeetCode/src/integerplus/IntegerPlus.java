package integerplus;

/**
 * @author : Qingfeng
 * @date : 2018/8/30
 * 不用加法实现两数相加
 */
public class IntegerPlus {
    public int getSum(int a, int b){
        int result = a ^ b;
        int carry = (a & b) << 1;
        if (carry != 0 ) result = getSum(result, carry);
        return result;
    }
}
