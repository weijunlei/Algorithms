package findgreatestsumofsubarray;

/**
 * @author : Qingfeng
 * @date : 2018/6/12
 */
public class FindGreatestSumOfSubArray {
    public int findGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int result = array[0];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum > result) {
                result = sum;
            }
            if (sum < 0){
                sum = 0;
            }
        }

        return result;
    }
}
