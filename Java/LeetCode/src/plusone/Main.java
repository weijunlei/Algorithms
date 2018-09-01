package plusone;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 */
public class Main {
    public static void main(String[] args){
        PlusOne plusOne = new PlusOne();
        int[] nums = {1, 2, 3};
        nums = plusOne.plusOne(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
