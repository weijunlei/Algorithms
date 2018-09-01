package movezeros;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 */
public class Main {
    public static void main(String[] args){
        MoveZeros moveZeros = new MoveZeros();
        int[] nums = {1,0,4,5,3,0,1,0};
        moveZeros.moveZeros(nums);
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
