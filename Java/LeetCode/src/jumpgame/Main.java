package jumpgame;

/**
 * @author : Qingfeng
 * @date : 2018/6/21
 */
public class Main {
    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {3,2,1,0,4};
        System.out.println(jumpGame.canJump(nums));
    }
}
