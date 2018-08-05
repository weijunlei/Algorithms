package increasingtriplet;

/**
 * @author : Qingfeng
 * @date : 2018/8/5
 */
public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums){
        if (nums == null || nums.length == 0){
            return false;
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i: nums
             ) {
            if (first == Integer.MAX_VALUE || i < first){
                first = i;
                continue;
            }
            if ((second == Integer.MAX_VALUE || i < second) && i != first){
                second = i;
                continue;
            }
            if (second != Integer.MAX_VALUE && i > second){
                return true;
            }
        }

        return false;
    }
}
