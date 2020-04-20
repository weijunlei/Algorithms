package lc_315_countSmaller;

import java.util.ArrayList;
import java.util.List;

class Solution2 {
    private int[] indexs;
    private int[] counters;
    private int[] temp;

    public List<Integer> countSmaller(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        indexs = new int[nums.length];
        counters = new int[nums.length];
        temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            indexs[i] = i;
            counters[i] = 0;
        }
        mergeSort(nums, 0, nums.length - 1);
        // for(int i = 0; i < nums.length; i++){
        //     System.out.printf("%d\t", nums[indexs[i]]);
        // }
        // System.out.println();
        for(int i = 0; i < counters.length; i++){
            result.add(counters[i]);
        }
        return result;
    }


    private void mergeSort(int[] nums, int left, int right){
        if (left < right){
            int mid = (left + right) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            mergeHelper(nums, left, mid, right);
        }
    }

    private void mergeHelper(int[] nums, int left, int mid , int right){
        int tempIndex = left;
        int leftIndex = left;
        int rightIndex = mid + 1;
        while (leftIndex <= mid && rightIndex <= right){
            if (nums[indexs[leftIndex]] <= nums[indexs[rightIndex]]){
                temp[tempIndex] = indexs[leftIndex];
                counters[indexs[leftIndex]] += rightIndex - mid - 1;
                leftIndex++;
            }else{
                temp[tempIndex] = indexs[rightIndex];
                rightIndex++;
            }
            tempIndex++;
        }
        while(leftIndex <= mid){
            temp[tempIndex] = indexs[leftIndex];
            counters[indexs[leftIndex]] += rightIndex - mid - 1;
            leftIndex++;
            tempIndex++;
        }
        while(rightIndex <= right){
            temp[tempIndex] = indexs[rightIndex];
            rightIndex++;
            tempIndex++;
        }
        for(int i = left; i <= right; i++){
            indexs[i] = temp[i];
        }
    }
}
