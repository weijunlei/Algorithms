package lc_166_fractionToDecimal;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0){
            return "0";
        }
        if (denominator == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        long devideNum = Math.abs(Long.valueOf(numerator));
        long devidedNum = Math.abs(Long.valueOf(denominator));
        int negetiveNum = 0;
        if (numerator < 0){
            negetiveNum += 1;
        }
        if (denominator < 0){
            negetiveNum += 1;
        }
        long remain = devideNum % devidedNum;
        if (negetiveNum == 1){
            sb.append("-");
        }
        sb.append(String.valueOf(devideNum / devidedNum));
        if (remain == 0){
            return sb.toString();
        }
        sb.append(".");
        Map<Long, Integer> remainMap = new HashMap<>();
        while (remain != 0){
            if (remainMap.containsKey(remain)){
                sb.insert(remainMap.get(remain), "(");
                sb.append(")");
                break;
            }
            remainMap.put(remain, sb.length());
            remain *= 10;
            sb.append(String.valueOf(remain / devidedNum));
            remain = remain % devidedNum;
        }
        return sb.toString();
    }
}
