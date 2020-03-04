package getnumberofk;

/**
 * @author : Qingfeng
 * @date : 2018/6/19
 */
public class ComplexGetNumberOfK {
    public int GetNumberOfK(int[] array, int k) {
        if (array == null || array.length == 0){
            return 0;
        }
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == k){
                result += 1;
            }
        }

        return result;
    }
}
