package lc_350_intersect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int num: nums1){
            if (!hashMap.containsKey(num)){
                hashMap.put(num, 0);
            }
            hashMap.put(num, hashMap.get(num) + 1);
        }
        for(int num: nums2){
            if (hashMap.containsKey(num) && hashMap.get(num) > 0){
                result.add(num);
                hashMap.put(num, hashMap.get(num) - 1);
            }
        }
        int[] intResult = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            intResult[i] = result.get(i);
        }
        return intResult;
    }
}
