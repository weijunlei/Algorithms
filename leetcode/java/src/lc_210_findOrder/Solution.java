package lc_210_findOrder;

import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] result = new int[numCourses];
        int[] depNum = new int[numCourses];
        List<List<Integer>> afters = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            afters.add(new ArrayList<Integer>());
        }
        for(int[] pres: prerequisites){
            afters.get(pres[1]).add(pres[0]);
            depNum[pres[0]] += 1;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if (depNum[i] == 0){
                queue.offer(i);
            }
        }
        // System.out.printf("%d\n", queue.size());
        int getIndex = 0;
        while(!queue.isEmpty()){
            int getNum = queue.remove();
            result[getIndex++] = getNum;
            for(int after: afters.get(getNum)){
                depNum[after] -= 1;
                if (depNum[after] == 0){
                    queue.offer(after);
                }
            }
        }
        return  getIndex == numCourses ? result: new int[0];
    }
}