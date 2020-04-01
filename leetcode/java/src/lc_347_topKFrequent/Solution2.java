package lc_347_topKFrequent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution2 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums){
            if (!map.containsKey(num)){
                map.put(num, 1);
            } else{
                map.put(num, map.get(num) + 1);
            }
        }

        List<Integer>[] sizeCount = new List[nums.length];

        for(int num: map.keySet()){
            int getCount = map.get(num) - 1;
            if (sizeCount[getCount] == null){
                sizeCount[getCount] = new ArrayList<Integer>();
            }
            sizeCount[getCount].add(num);
        }

        List<Integer> maxQueue = new ArrayList<>();
        for(int i = nums.length - 1; i >= 0 && maxQueue.size() < k; i--){
            if (sizeCount[i] == null){
                continue;
            }else {
                maxQueue.addAll(sizeCount[i]);
            }
        }
        return maxQueue;
    }
}
