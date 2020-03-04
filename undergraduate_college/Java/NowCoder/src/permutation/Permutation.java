package permutation;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author : Qingfeng
 * @date : 2018/6/10
 */
public class Permutation {
    public ArrayList<String> permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str != null && str.length() != 0){
            permutationHelper(str.toCharArray(), 0 , result);
            Collections.sort(result);
        }

        return result;
    }

    private void permutationHelper(char[] chList, int num, ArrayList<String> result) {
        if (num == chList.length - 1){
            String str = String.valueOf(chList);
            if (! result.contains(str)){
                result.add(str);
            }
        }

        else
        {
            for (int j = num; j < chList.length; j ++){
                swap(chList, num, j);
                permutationHelper(chList, num + 1, result);
                swap(chList, num, j);
            }
        }
    }

    private void swap(char[] chList, int num1, int num2){
        char tempCh = chList[num1];
        chList[num1] = chList[num2];
        chList[num2] = tempCh;
    }
}
