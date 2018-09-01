package rotate;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 */
public class BetterRotate {
    public void rotate(int[] nums, int k){
        if (nums.length == 0) {
            return;
        }

        k = k % nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    private void reverse(int[] nums, int left , int right){
        while (left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
