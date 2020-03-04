package topkfrequent;

import java.util.List;

/**
 * @author : Qingfeng
 * @date : 2018/8/19
 */
public class Main {
    public static void main(String[] args){
        TopKFrequent topKFrequent = new TopKFrequent();
        int[] nums = {1,1,2,2,3,3};
        List<Integer> result = topKFrequent.topKFrequent(nums, 1);
        System.out.println(result.toString());
    }
}
