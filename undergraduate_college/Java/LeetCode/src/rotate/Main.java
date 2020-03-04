package rotate;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 */
public class Main {
    public static void main(String[] args){
        Rotate rotate = new Rotate();
        BetterRotate betterRotate = new BetterRotate();
        int[] nums = {1,2,3,4,5,6,7};
//        rotate.rotate(nums, 4);
        betterRotate.rotate(nums, 4);
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
