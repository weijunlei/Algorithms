package mediumofdata;

import java.util.ArrayList;

/**
 * @author : Qingfeng
 * @date : 2018/7/6
 */
public class MediumOfData {
    ArrayList<Integer> dataStream = new ArrayList<>();
    public void insert(Integer num){
        dataStream.add(num);
    }


    public Double getMedian() {
        if (dataStream.size() == 0){
            return (Double)null;
        }
        int[] nums = new int[dataStream.size()];
        double result;
        for(int i = 0; i < dataStream.size(); i++){
            nums[i] = dataStream.get(i);
        }
        if (dataStream.size() % 2 == 1){
            int medium = (dataStream.size() + 1) / 2  - 1;
            medium = getPivot(nums, medium, 0, dataStream.size() - 1);
            result = (double)medium;
        }
        else{
            int leftMedium = dataStream.size() / 2 - 1;
            double medium = getPivot(nums, leftMedium, 0, dataStream.size() - 1);
            medium += getPivot(nums, leftMedium + 1, leftMedium, dataStream.size() - 1);
            medium = medium / 2;
            result = (double)medium;
        }
        return result;
    }

    private int getPivot(int[] nums, int index, int left, int right){
        if (nums == null || nums.length == 0){
            return (Integer)null;
        }
        int getIndex = posOfIndex(nums, left, right);
        if (getIndex == index){
            return nums[index];
        }
        else if (getIndex > index){
            return getPivot(nums, index, left, getIndex - 1);
        }
        else{
            return getPivot(nums, index, getIndex + 1, right);
        }
    }

    private int posOfIndex(int[] nums, int left, int right){
        int randomIndex = left + (int)(Math.random() * (right - left + 1));
        exchange(nums, left, randomIndex);
        int getNum = nums[left];
        int getIndex = left ;
        for(int i = left + 1; i <= right; i ++){
            if (nums[i] < getNum){
                getIndex++;
                exchange(nums, getIndex, i);
            }
        }
        exchange(nums, left, getIndex);
        return getIndex;
    }

    private void exchange(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
