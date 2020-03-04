package threesum;

import java.util.*;

/**
 * @author : Qingfeng
 * @date : 2018/6/24
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length < 3){
            return lists;
        }
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if (i != 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            int addedNum = - nums[i];

            while (left < right){
                if (nums[left] + nums[right] == addedNum){
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    lists.add(list);
                    while(right > 0 && nums[right] == nums[right - 1]) {
                        right --;
                    }
                    while(left  < nums.length - 1 && nums[left] == nums[left + 1]){
                        left ++;
                    }
                    left ++;
                    right --;
                }
                else if (nums[left] + nums[right] > addedNum){
                    right --;
                }
                else{
                    left ++;
                }
            }
        }
        return lists;
    }

    public List<List<Integer>> threeSum2(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || (i > 0 && num[i] != num[i-1])) {
                int lo = i+1, hi = num.length-1, sum = 0 - num[i];
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }
}
