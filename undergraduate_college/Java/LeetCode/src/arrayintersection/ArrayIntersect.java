package arrayintersection;

import java.util.ArrayList;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 */
public class ArrayIntersect {
    public int[] intersect(int[] nums1, int[] nums2){
        if (nums1 == null || nums1.length == 0){
            return nums1;
        }

        if (nums2 == null || nums2.length == 0){
            return nums2;
        }

        ArrayList<Integer> result = new ArrayList<>();
        boolean[] numVisit = new boolean[nums2.length];

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if (!numVisit[j] && nums1[i] == nums2[j]){
                    numVisit[j] = true;
                    result.add(nums2[j]);
                    break;
                }
            }
        }

        int[] resultArray = new int[result.size()];
        for(int i = 0 ; i < result.size(); i++){
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}
