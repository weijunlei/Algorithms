package lc_347_topKFrequent;

import java.util.*;

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums){
            if (!map.containsKey(num)){
                map.put(num, 1);
            } else{
                map.put(num, map.get(num) + 1);
            }
        }

        PriorityQueue<Integer> pq =
                new PriorityQueue<Integer>((n1, n2) -> map.get(n1) - map.get(n2));
        for(int num: map.keySet()){
            pq.add(num);
            if (pq.size() > k){
                pq.poll();
            }
        }

        List<Integer> maxQueue = new ArrayList<>();
        while (pq.size() != 0){
            maxQueue.add(pq.poll());
        }
        Collections.reverse(maxQueue);
        return maxQueue;
    }
}
