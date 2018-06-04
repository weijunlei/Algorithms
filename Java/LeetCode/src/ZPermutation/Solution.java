package ZPermutation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public ArrayList<String> Permutation(String str) {
        List<String> result = new ArrayList<>();
        if (str.length() != 0)
            addPermutation(str.toCharArray(), 0, result);
        Collections.sort(result);
        return (ArrayList)result;
    }

    public void addPermutation(char[] charList, int i, List<String> result)
    {
        if (i == charList.length - 1)
        {
            String val = String.valueOf(charList);
            if (! result.contains(val))
                result.add(val);
        }
        else
        {
            for(int j = i; j < charList.length; j ++)
            {
                swap(charList, i, j);
                addPermutation(charList, i+1, result);
                swap(charList, i, j);
            }
        }
    }

    public void swap(char[] charList, int i, int j)
    {
        char temp = charList[i];
        charList[i] = charList[j];
        charList[j] = temp;
    }
}
