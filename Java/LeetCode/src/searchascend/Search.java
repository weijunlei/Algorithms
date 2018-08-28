package searchascend;

/**
 * @author : Qingfeng
 * @date : 2018/8/28
 */
public class Search {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        int targetIndex = -1;
        int mid = -1;
        while(right >= left){
            mid = (left + right) / 2;
            if (target == nums[mid]){
                targetIndex = mid;
                break;
            }
            if (nums[mid] >= nums[left]){
                if (nums[mid] > target && target >= nums[left]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if (nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }

        return targetIndex;
    }
}
