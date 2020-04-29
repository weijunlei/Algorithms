package lc_207_canFinish;

import java.util.*;

class Solution2 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses == 0 || prerequisites == null || prerequisites.length == 0 || prerequisites[0] == null || prerequisites[0].length == 0){
            return true;
        }
        int[] hasVisit = new int[numCourses];
        List<List<Integer>> numOutput = new ArrayList();
        for(int i = 0; i < numCourses; i++){
            numOutput.add(new ArrayList<Integer>());
        }
        for(int[] pre: prerequisites){
            numOutput.get(pre[1]).add(pre[0]);
        }
        for(int i = 0; i < numCourses; i++){
            if (hasLoop(numOutput, hasVisit, i)){
                return false;
            }
        }
        return true;
    }

    private boolean hasLoop(List<List<Integer>> numOutput, int[] hasVisit, int index){
        if (hasVisit[index] == 1){
            return true;
        }
        if (hasVisit[index] == -1){
            return false;
        }
        hasVisit[index] = 1;
        for(int getIndex: numOutput.get(index)){
            if (hasLoop(numOutput, hasVisit, getIndex)){
                return true;
            }
        }
        hasVisit[index] = -1;
        return false;
    }
}