package searchrange;

/**
 * @author : Qingfeng
 * @date : 2018/8/27
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target){
        int[] result = {-1, -1};
        if (nums == null || nums.length == 0){
            return result;
        }

        int left = 0;
        int right = nums.length - 1;
        int firstTarget = -1;
        int mid = -1;

        while(left <= right){
            mid = (left + right) / 2;
            if (nums[mid] == target){
                firstTarget = mid;
                break;
            }
            else if (nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        if (firstTarget != -1){
            result[0] = firstTarget;
            result[1] = firstTarget;
            while (result[0] > 0 && nums[result[0] - 1] == target){
                result[0]--;
            }
            while(result[1] < nums.length - 1 && nums[result[1] + 1] == target){
                result[1]++;
            }
        }

        return result;
    }
}
