package steelcutting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author : Qingfeng
 * @date : 2018/6/21
 */
public class SteelCutting {
    // 自底向上实现钢条切割的最大收益解
    public int maxSteelCutting(int[] profitList, int steelLength) {
        if (profitList == null || profitList.length == 0) {
            return 0;
        }

        int[] maxProfitList = new int[steelLength];
        maxProfitList[0] = profitList[0];

        for (int i = 1; i < steelLength; i++){
            int maxProfit = profitList[i];
            for(int j=0; j < i; j++) {
                int tempProfit = maxProfitList[j] + maxProfitList[i - j - 1];
                if (tempProfit > maxProfit) {
                    maxProfit = tempProfit;
                }
            }
            maxProfitList[i] = maxProfit;
        }
        return maxProfitList[maxProfitList.length - 1];
    }

    // 自顶向下加备忘机制实现钢条切割
    public int maxSteelCuttingTB(int[] profitList, int steelLength) {
        if (profitList == null || profitList.length == 0) {
            return 0;
        }

        int[] maxProfitList = new int[steelLength];
        for(int i = 0; i < maxProfitList.length; i++) {
            maxProfitList[i] = Integer.MIN_VALUE;
        }

        return maxSteelCuttingHelper(profitList, steelLength, maxProfitList);
    }

    private int maxSteelCuttingHelper(int[] profitList, int n, int[] maxProfitList) {
        if (n > 0 && maxProfitList[n - 1] >= 0) {
            return maxProfitList[n - 1];
        }
        int result = profitList[n - 1];

        if (n == 1) {
            maxProfitList[0] = profitList[0];
            return result;
        }
        else{
            for (int i = 0; i < n - 1; i++) {
                int tempProfit = profitList[i] + maxSteelCuttingHelper(profitList, n - i - 1, maxProfitList);
                if (tempProfit > result) {
                    result = tempProfit;
                }
            }
        }
        maxProfitList[n - 1]  =result;
        return result;
    }

    // 自底向上重构解
    public ArrayList<ArrayList<Integer>> rebuildSteelCutting(int[] profitList, int steelLength){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (profitList == null || profitList.length == 0 || steelLength <= 0) {
           return result;
        }

        int[] maxProfitList = new int[steelLength];
        int[] rebuildMaxList = new int[steelLength];
        maxProfitList[0] = profitList[0];
        rebuildMaxList[0] = 1;

        for(int i = 1; i < steelLength; i ++){
            int maxProfit = profitList[i];
            rebuildMaxList[i] = i + 1;

            for (int j=0; j < i; j++){
                int tempMaxProfit = maxProfitList[j] + maxProfitList[i - j - 1];
                if (tempMaxProfit > maxProfit) {
                    maxProfit = tempMaxProfit;
                    rebuildMaxList[i] = j + 2;
                }
            }
            maxProfitList[i] = maxProfit;
        }

        ArrayList<Integer> maxProfitArrayList = new ArrayList<>();
        ArrayList<Integer> rebuildArrayList = new ArrayList<>();

        for(int i : maxProfitList) {
            maxProfitArrayList.add(i);
        }

        for (int i : rebuildMaxList) {
            rebuildArrayList.add(i);
        }

        result.add(maxProfitArrayList);
        result.add(rebuildArrayList);

        return result;
    }
}
