package findnumberswithsum;

import java.util.ArrayList;

/**
 * @author : Qingfeng
 * @date : 2018/6/20
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        if (array == null || array.length == 0) {
            return result;
        }

        int lessIndex = 0;
        int biggerIndex = array.length - 1;

        while (lessIndex < biggerIndex) {
            if (array[lessIndex] + array[biggerIndex] == sum) {
                result.add(array[lessIndex]);
                result.add(array[biggerIndex]);

                return result;
            }
            else if (array[lessIndex] + array[biggerIndex] > sum) {
                biggerIndex --;
            }
        }

        return result;
    }
}
