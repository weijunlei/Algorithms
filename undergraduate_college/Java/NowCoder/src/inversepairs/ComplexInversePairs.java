package inversepairs;

/**
 * @author : Qingfeng
 * @date : 2018/6/19
 */
public class ComplexInversePairs {
    public int inversePairs(int [] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int result = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    result += 1;
                }
            }
        }

        return result;
    }
}
