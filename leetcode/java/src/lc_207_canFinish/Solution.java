package lc_207_canFinish;

import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses == 0 || prerequisites == null || prerequisites.length == 0 || prerequisites[0] == null || prerequisites[0].length == 0){
            return true;
        }
        int[] dps = new int[numCourses];
        List<List<Integer>> numOutput = new ArrayList();
        for(int i = 0; i < numCourses; i++){
            numOutput.add(new ArrayList<Integer>());
        }
        for(int[] pre: prerequisites){
            numOutput.get(pre[0]).add(pre[1]);
            dps[pre[1]] += 1;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if (dps[i] == 0){
                queue.offer(i);
            }
        }
        int amount = 0;
        while (!queue.isEmpty()){
            int getNum = queue.remove();
            amount += 1;
            for(int num: numOutput.get(getNum)){
                dps[num] -= 1;
                if (dps[num] == 0){
                    queue.offer(num);
                }
            }
        }
        return amount == numCourses;
    }
}
