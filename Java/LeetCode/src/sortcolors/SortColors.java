package sortcolors;

/**
 * @author : Qingfeng
 * @date : 2018/8/19
 */
public class SortColors {
    public void sortColors(int[] nums){
        if (nums == null || nums.length == 0){
            return;
        }

        int[] colorCounts = {0, 0, 0};
        for(int num : nums){
            colorCounts[num]++;
        }

        int numCount = 0;
        int tempCount = 0;
        while(tempCount < nums.length){
            if (colorCounts[numCount] > 0){
                nums[tempCount++] = numCount;
                colorCounts[numCount]--;
            }else{
                numCount++;
            }
        }
    }
}
