package findnumberswithsum;

import findcontinuoussequence.FindContinuousSequence;

import java.util.ArrayList;

/**
 * @author : Qingfeng
 * @date : 2018/6/20
 */
public class Main {
    public static void main(String[] args) {
        FindNumbersWithSum findNumbersWithSum = new FindNumbersWithSum();
        int[] nums = {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> result = findNumbersWithSum.findNumbersWithSum(nums, 8);
        System.out.println(result.toString());
    }
}
