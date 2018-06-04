package reorderarray;

/**
 * @author : Qingfeng
 * @date : 2018/6/4
 */
public class ReOrderArray {
    public void reOrderArray (int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int[] tempArray = new int[array.length];
        int oddNum = 0;
        int oddIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                oddNum ++;
            }
            tempArray[i] = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (tempArray[i] % 2 == 0) {
                array[oddNum++] = tempArray[i];
            }
            else {
                array[oddIndex++] = tempArray[i];
            }
        }
    }
}
