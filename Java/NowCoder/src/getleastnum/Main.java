package getleastnum;

import java.util.ArrayList;

/**
 * @author : Qingfeng
 * @date : 2018/6/11
 */
public class Main {
    public static void main(String[] args) {
        GetLeastNum getLeastNum = new GetLeastNum();
        int[] nums = { 3,4,5,9,11,2,4,1};

        ArrayList<Integer> result = getLeastNum.getLeastNum(nums, 10);

        System.out.println(result.toString());
    }
}
