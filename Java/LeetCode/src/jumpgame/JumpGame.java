package jumpgame;

/**
 * @author : Qingfeng
 * @date : 2018/6/21
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
//        一般动态规划思路
//        if (nums == null || nums.length == 0) {
//            return false;
//        }
//
//        boolean[] canJumpList = new boolean[nums.length];
//        for(int i = 0; i < nums.length; i++) {
//            canJumpList[i] = false;
//        }
//        canJumpList[nums.length -  1] = true;
//
//        for(int i = nums.length - 2; i >= 0; i--) {
//            for (int j = 1; j <= nums[i]; j++) {
//                if (i + j > nums.length - 1 || canJumpList[i + j]){
//                    canJumpList[i] = true;
//                }
//            }
//        }
//
//        return canJumpList[0];

        // 较好动态规划思路
        if (nums == null || nums.length == 0) {
            return false;
        }
        int canReach = 0;
        int index = 0;
        while (index < nums.length && index <= canReach){
            canReach = Math.max(canReach, index + nums[index]);
            index ++;
        }

        return canReach >= nums.length - 1;
    }
}
