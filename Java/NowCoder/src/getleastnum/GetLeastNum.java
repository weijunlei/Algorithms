package getleastnum;

import java.util.ArrayList;

/**
 * @author : Qingfeng
 * @date : 2018/6/10
 */
public class GetLeastNum {
    public ArrayList<Integer> getLeastNum(int[] nums, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0 || nums.length < k || k <= 0) {
            return result;
        }

        int getIndex = getPivoit(nums, 0, nums.length - 1);
        int startIndex = 0;
        int endIndex = nums.length - 1;
        while (getIndex != k - 1) {
            if (getIndex > k - 1) {
                endIndex = getIndex - 1;
            }
            else{
                startIndex = getIndex + 1;
            }
            getIndex = getPivoit(nums, startIndex, endIndex);
        }

        for (int i = 0; i < k; i ++) {
            result.add(nums[i]);
        }

        return result;
    }

    private int getPivoit(int[] nums, int startIndex, int endIndex) {
        int getNum = nums[endIndex];
        int getIndex = startIndex - 1;
        for (int i = startIndex; i < endIndex; i++) {
            if (nums[i] < getNum)
            {
                getIndex ++;
                swap(nums, i, getIndex);
            }
        }
        getIndex ++;
        swap(nums, getIndex, endIndex);

        return getIndex;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
