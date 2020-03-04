package majorityelement;

/**
 * @author : Qingfeng
 * @date : 2018/8/30
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }

        int result = nums[0];
        int numCount = 0;

        for(int i = 0; i < nums.length; i++){
            if (numCount == 0){
                result = nums[i];
                numCount ++;
            }
            else if (result != nums[i]){
                numCount --;
            }else{
                numCount ++;
            }
        }

        return result;
    }
}
