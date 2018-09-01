package twosum;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 */
public class Main {
    public static void main(String[] args){
        TwoSum twoSum = new TwoSum();
        int[] nums = {2,7,11,15};

//        int[] result = twoSum.twoSum(nums, 9);
        BetterTwoSum betterTwoSum = new BetterTwoSum();
        int[] result = twoSum.twoSum(nums, 9);
        System.out.printf("%d %d\n", result[0], result[1]);
    }
}
