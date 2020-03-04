package movezeros;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 */
public class MoveZeros {
    public void moveZeros(int[] nums){
        if (nums == null || nums.length == 0){
            return;
        }

        int usedIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[usedIndex++] = nums[i];
            }
        }

        for (int i = usedIndex; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
