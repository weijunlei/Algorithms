package morethanhalfnum;

import java.util.HashMap;

/**
 * @author : Qingfeng
 * @date : 2018/6/10
 */
public class MoreThanHalfNum {
    public int morethanhalfnum(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else{
                map.put(nums[i] , map.get(nums[i]) + 1);
            }
        }

        for(int i=0; i < nums.length; i ++) {
            if (map.get(nums[i]) >= nums.length / 2 + 1) {
                result = nums[i];
            }
        }

        return result;
    }
}
