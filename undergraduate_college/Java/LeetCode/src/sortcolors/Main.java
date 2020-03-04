package sortcolors;

import java.util.ArrayList;

/**
 * @author : Qingfeng
 * @date : 2018/8/19
 */
public class Main {
    public static void main(String[] args){
        SortColors sortColors = new SortColors();
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors.sortColors(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.printf("%d\t", nums[i]);
        }
        System.out.println("\n");
    }
}
