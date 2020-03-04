package fraction2decimal;

import java.util.HashMap;

/**
 * @author : Qingfeng
 * @date : 2018/8/30
 * 分数到小数
 * 题目链接：https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/53/math/118/
 */
public class FractionToDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        if (denominator == 0){
            return "";
        }
        if (numerator % denominator == 0){
            return Long.toString(((long)numerator) / denominator);
        }

        boolean isNegetive = (numerator > 0) ^ (denominator > 0);
        //System.out.println(isNegetive);
        long absNumerator = (long) Math.abs((long)numerator);
        long absDenominator = (long) Math.abs((long)denominator);
        /*System.out.println(absNumerator);
        System.out.println(absDenominator);*/

        HashMap<Long, Integer> modMap = new HashMap<>();
        StringBuilder sb = new StringBuilder(Long.toString(absNumerator / absDenominator));
        int repeatIndex = sb.length() + 1;
        //System.out.println(repeatIndex);
        sb.append(".");

        long modLeft = absNumerator % absDenominator;

        int addIndex = 0;
        while (modLeft != 0 && !modMap.containsKey(modLeft)){
            modMap.put(modLeft, addIndex ++);
            modLeft *= 10;
            sb.append(modLeft / absDenominator);
            modLeft = modLeft % absDenominator;
        }

        if (modLeft != 0){
            sb.insert(repeatIndex + modMap.get(modLeft), '(');
            sb.append(')');
        }

        if (isNegetive){
            sb.insert(0, '-');
        }

        return sb.toString();
    }
}
