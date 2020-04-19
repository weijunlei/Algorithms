package lc_218_getSkyline;

import java.util.*;

class Solution2 {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> result = new ArrayList<>();
        if (buildings.length == 0){
            return result;
        }
        List<List<Integer>> marks = new ArrayList<>();
        for(int[] nums: buildings){
            marks.add(new ArrayList<Integer>(){{add(nums[0]);add(-nums[2]);}});
            marks.add(new ArrayList<Integer>(){{add(nums[1]); add(nums[2]);}});
        }

        Collections.sort(marks, new Comparator<List<Integer>>(){
            @Override
            public int compare(List<Integer> o1, List<Integer> o2){
                int x1 = o1.get(0);
                int x2 = o2.get(0);
                int y1 = o1.get(1);
                int y2 = o2.get(1);
                if (x1 != x2){
                    return x1 - x2;
                }else{
                    return y1 - y2;
                }
            }
        });

        Queue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o2 - o1;
            }
        });
        queue.offer(0);
        int preY = 0;
        for(List<Integer> nums: marks){
            int x = nums.get(0);
            int y = nums.get(1);

            if (y < 0){
                queue.offer(-y);
            }else{
                queue.remove(y);
            }
            int curMax = queue.peek();
            if (preY != curMax){
                result.add(new ArrayList<Integer>(){{add(x); add(curMax);}});
                preY = curMax;
            }
        }
        return result;
    }
}