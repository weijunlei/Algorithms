package FindNumsApperaOnce;

import java.util.HashMap;

/**
 * @author : Qingfeng
 * @date : 2018/6/19
 */
public class ComplexFindNumsAppearOnce {
    public void findNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null || array.length == 0) {
            return;
        }
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for (int i : array) {
            if (hashMap.containsKey(i)) {
                hashMap.put(i, false);
            }
            else{
                hashMap.put(i, true);
            }
        }

        boolean isFirst = true;
        for(int i : array) {
            if (hashMap.get(i)) {
                if (!isFirst) {
                    num2[0] = i;
                }
                else {
                    num1[0] = i;
                    isFirst = false;
                }
            }
        }
    }
}
