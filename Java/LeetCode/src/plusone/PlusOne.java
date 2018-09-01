package plusone;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 * 加一
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/27/
 */
public class PlusOne {
    public int[] plusOne(int[] digits){
        if (digits == null || digits.length == 0){
            return digits;
        }

        int carry = 0;
        for(int i = digits.length - 1; i >= 0; i--){
            if (i == digits.length - 1){
                carry = (digits[i] + 1) / 10;
                digits[i] = (digits[i] + 1) % 10;
            }else{
                int tempCarry = (carry + digits[i]) / 10;
                digits[i] = (digits[i] + carry) % 10;
                carry = tempCarry;
            }
        }

        int[] result = new int[digits.length + carry];
        for (int i = carry; i < result.length; i++){
            result[i] = digits[i - carry];
        }

        if (carry != 0){
            result[0] = carry;
        }

        return result;
    }
}
