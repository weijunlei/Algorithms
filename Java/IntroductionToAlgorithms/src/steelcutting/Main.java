package steelcutting;

import java.util.ArrayList;

/**
 * @author : Qingfeng
 * @date : 2018/6/21
 * 钢条切割
 */
public class Main {
    public static void main(String[] args) {
        SteelCutting steelCutting = new SteelCutting();
        int[] nums = {1,5,8,9,10,17,17,20,24,30};

        for(int i = 1; i <= 10; i++) {
            System.out.println(steelCutting.maxSteelCutting(nums, i));
            System.out.println(steelCutting.maxSteelCuttingTB(nums, i));
            ArrayList<ArrayList<Integer>> result = steelCutting.rebuildSteelCutting(nums, i);
            for(ArrayList<Integer> j : result) {
                System.out.println(j.toString());
            }
        }
    }
}
