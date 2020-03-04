package subset;

import java.util.List;

/**
 * @author : Qingfeng
 * @date : 2018/8/19
 */
public class Main {
    public static void main(String[] args){
        SubSet subSet = new SubSet();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subSet.subsets(nums);
        for(List<Integer> li : result){
            System.out.println(li);
        }
        boolean[] isSearched = new boolean[4];

    }
}
