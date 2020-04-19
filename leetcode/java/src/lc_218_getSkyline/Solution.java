package lc_218_getSkyline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> result = new ArrayList<>();
        int n = buildings.length;

        if (n == 0){return result;}
        if (n == 1){
            result.add(new ArrayList<Integer>() {{add(buildings[0][0]); add(buildings[0][2]);}});
            result.add(new ArrayList<Integer>() {{add(buildings[0][1]); add(0);}});
            return result;
        }

        List<List<Integer>> left, right;
        left = getSkyline(Arrays.copyOfRange(buildings,0, n / 2));
        right = getSkyline(Arrays.copyOfRange(buildings, n/2, n));

        return mergeResult(left, right);
    }

    private List<List<Integer>> mergeResult(List<List<Integer>> left, List<List<Integer>> right){
        int ls = 0, rs = 0;
        int le = left.size(), re = right.size();
        int leftY = 0, rightY = 0, curY = 0;
        int x, maxY;
        List<List<Integer>> result = new ArrayList<>();

        while (ls < le && rs < re){
            List<Integer> leftP = left.get(ls);
            List<Integer> rightP = right.get(rs);

            if (leftP.get(0) < rightP.get(0)){
                x = leftP.get(0);
                ls ++;
                leftY = leftP.get(1);
            }else{
                x = rightP.get(0);
                rs ++;
                rightY = rightP.get(1);
            }
            maxY = Math.max(leftY, rightY);
            if (curY != maxY){
                updateResult(result, x, maxY);
                curY = maxY;
            }
        }

        addRest(result, left, ls, le, curY);
        addRest(result, right, rs, re, curY);
        return result;
    }

    private void updateResult(List<List<Integer>> result, int x, int y){
        if (result.isEmpty() || result.get(result.size() - 1).get(0) != x){
            result.add(new ArrayList<Integer>(){{add(x); add(y);}});
        }else{
            result.get(result.size() - 1).set(1, y);
        }
    }

    private void addRest(List<List<Integer>> result, List<List<Integer>> left, int s, int e, int curY){
        while (s < e){
            List<Integer> point = left.get(s);
            int x = point.get(0);
            int y = point.get(1);
            s ++;

            if (y != curY){
                updateResult(result, x, y);
                curY = y;
            }
        }
    }

}