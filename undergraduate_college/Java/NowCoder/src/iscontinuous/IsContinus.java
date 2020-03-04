package iscontinuous;

import java.util.Arrays;

/**
 * @author : Qingfeng
 * @date : 2018/6/20
 */
public class IsContinus {
    public boolean isContinuous(int[] numbers) {
        boolean result = false;
        if (numbers == null || numbers.length != 5) {
            return result;
        }

        Arrays.sort(numbers);
        int zeroNums = 0;
        int addCount = 0;
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0){
                zeroNums ++;
            }
            else{
                if (i + 1 < numbers.length){
                    if (numbers[i] == numbers[i + 1]){
                        return result;
                    }
                    else{
                        addCount += numbers[i + 1] - numbers[i] - 1;
                    }
                }
            }
        }

        result = zeroNums >= addCount;

        return result;
    }
}
