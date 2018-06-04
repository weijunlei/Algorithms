package ZFindOnceNumbers;

import java.util.HashMap;

public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array == null || array.length == 0)
            return;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++)
        {
            if (hashMap.containsKey(array[i]))
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            else
                hashMap.put(array[i], 1);
        }

        int getCount = 0;
        for(int i = 0; i < array.length; i++)
        {
            if (hashMap.get(array[i]) == 1)
                if (getCount == 0)
                {
                    num1[0] = array[i];
                    getCount += 1;
                }
                else
                    num2[0] = array[i];
        }
    }
}
