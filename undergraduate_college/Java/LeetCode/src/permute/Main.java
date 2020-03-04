package permute;

import java.util.List;

/**
 * @author : Qingfeng
 * @date : 2018/8/18
 */
public class Main {
    public static void main(String[] args){
        Permutation permutation = new Permutation();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permutation.permutation(nums);
        for(List<Integer> li : result){
            System.out.println(li.toString());
        }
    }
}
