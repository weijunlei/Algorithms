package findkthlargest;

/**
 * @author : Qingfeng
 * @date : 2018/8/21
 */
public class FindKthLargest {
    public int findKthLargest(int[] nums, int k){
        if (nums == null || nums.length == 0 || nums.length < k || k <= 0){
            return 0;
        }

        int getIndex = -1;
        int left = 0;
        int right = nums.length - 1;
        do{
            getIndex = getPartition(nums, left, right);
            if (getIndex < k - 1){
                left = getIndex + 1;
            }
            if (getIndex > k - 1){
                right = getIndex - 1;
            }
        }while (getIndex != k - 1);

        return nums[k - 1];
    }

    private int getPartition(int[] nums, int left, int right){
        int getIndex = left;
        int getRandomSwap = left + (int)Math.random() * (right - left + 1);
        swap(nums, getIndex, getRandomSwap);
        int getNum = nums[getIndex];

        for(int i = left + 1; i <= right; i++){
            if (getNum < nums[i]){
                getIndex ++;
                swap(nums, getIndex, i);
            }
        }

        swap(nums, getIndex, left);
        return getIndex;
    }

    private void swap(int[] nums, int m, int n){
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }
}
