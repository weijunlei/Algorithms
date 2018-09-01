package arrayintersection;

import java.util.Arrays;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 */
public class BetterArrayIntersection {
    public int[] intersection(int[] nums1, int[] nums2){
        if (nums1 == null || nums1.length == 0){
            return nums1;
        }
        if (nums2 == null || nums2.length == 0){
            return nums2;
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int resultLength = nums1.length > nums2.length ? nums1.length : nums2.length;
        int[] tempResult = new int[resultLength];

        int num1Index = 0;
        int num2Index = 0;
        int usedIndex = 0;

        while (num1Index < nums1.length && num2Index < nums2.length){
            if (nums1[num1Index] == nums2[num2Index]){
                tempResult[usedIndex++] = nums1[num1Index];
                num1Index++;
                num2Index++;
            }
            else if (nums1[num1Index] > nums2[num2Index]){
                num2Index++;
            }else{
                num1Index++;
            }
        }

        int[] result = new int[usedIndex];
        for (int i = 0; i < usedIndex; i++){
            result[i] = tempResult[i];
        }

        return result;
    }
}
