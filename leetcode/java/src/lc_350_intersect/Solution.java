package lc_350_intersect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int aIndex = 0;
        int bIndex = 0;
        while(aIndex < nums1.length && bIndex < nums2.length){
            if (nums1[aIndex] == nums2[bIndex]){
                result.add(nums1[aIndex]);
                aIndex ++;
                bIndex ++;
            } else if(nums1[aIndex] < nums2[bIndex]){
                aIndex ++;
            } else {
                bIndex ++;
            }
        }
        int[] intResult = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            intResult[i] = result.get(i);
        }
        return intResult;
    }
}
