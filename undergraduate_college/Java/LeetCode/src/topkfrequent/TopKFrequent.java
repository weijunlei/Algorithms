package topkfrequent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Qingfeng
 * @date : 2018/8/19
 */
public class TopKFrequent {
    public List<Integer> topKFrequent(int[] nums, int k){
        List<Integer> result = new ArrayList<>();

        if (nums == null || nums.length == 0){
            return result;
        }
        List<Integer>[] budget = new List[nums.length + 1];
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for(int key : freqMap.keySet()){
            int freq = freqMap.get(key);
            if (budget[freq] == null){
                budget[freq] = new ArrayList<>();
            }
            budget[freq].add(key);
        }

        for(int i = budget.length - 1; i >= 0 && k > result.size(); i --){
            if (budget[i] != null){
                result.addAll(budget[i]);
            }
        }

        return result;
    }
}
