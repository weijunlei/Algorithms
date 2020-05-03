package lc_149_maxPoints;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxPoints(int[][] points) {
        if (points.length < 3){
            return points.length;
        }
        int duplicatedNum = 0;
        int num = points.length;
        int result = 0;
        for(int i = 0;i < num - 1; i++){
            if (points[i][0] != points[i + 1][0] || points[i][1] != points[i+1][1]){
                break;
            }
            duplicatedNum += 1;
        }
        if (duplicatedNum - 1 == num){
            return num;
        }

        for(int i = 0; i < num - 1; i++){
            duplicatedNum = 0;
            Map<String, Integer> tempMap = new HashMap<>();
            int tempMax = 0;
            for(int j = i + 1; j < num; j++){
                int x = points[i][0] - points[j][0];
                int y = points[i][1] - points[j][1];
                int tempGcb = gcb(x, y);
                if (x == 0 && y == 0){
                    duplicatedNum += 1;
                    continue;
                }
                x = x / tempGcb;
                y = y / tempGcb;
                String tempKey = x + "#" + y;
                if (!tempMap.containsKey(tempKey)){
                    tempMap.put(tempKey, 0);
                }
                tempMap.put(tempKey, tempMap.get(tempKey) + 1);
                if (tempMap.get(tempKey) > tempMax){
                    tempMax = tempMap.get(tempKey);
                }

            }
            if (tempMax + duplicatedNum + 1 > result){
                result = tempMax + duplicatedNum + 1;
            }
        }
        return result;

    }

    private int gcb(int a, int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
