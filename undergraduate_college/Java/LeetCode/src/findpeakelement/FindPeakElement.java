package findpeakelement;

/**
 * @author : Qingfeng
 * @date : 2018/8/27
 * 题目：寻找峰值
 * 题目链接：https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/50/sorting-and-searching/99/
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums){
        if (nums == null || nums.length == 0){
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        if (right == 0 || nums[0] > nums[1]){
            return 0;
        }
        if (nums[right] > nums[right - 1]){
            return right;
        }
        int mid = -1;


        while (right > left){
            mid = (left + right) / 2;
            if (nums[mid - 1] < nums[mid] && nums[mid + 1] < nums[mid]){
                return mid;
            }
            else if (nums[mid - 1] < nums[mid] && nums[mid + 1] > nums[mid]){
                left = mid;
            }else{
                right = mid;
            }
        }

        return -1;
    }
}
