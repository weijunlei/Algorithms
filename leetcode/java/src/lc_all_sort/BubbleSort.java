package lc_all_sort;

public class BubbleSort {
    public void bubbleSort(int[] nums){
        if (nums == null || nums.length == 0){
            return;
        }
        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if (nums[j] > nums[j + 1]){
                    swap(nums, j, j + 1);
                }
            }
        }
    }

    // 在冒泡的基础上增加了在某一轮次是否发生交换的判定来对后续数组是否有序进行判别
    public void bubbleSort1(int[] nums){
        if (nums == null || nums.length == 0){
            return;
        }
        int n = nums.length;
        boolean hasSwap = true;
        for(int i = 0; i < n - 1; i++){
            if (!hasSwap){
                return;
            }
            hasSwap = false;
            for(int j = 0; j < n - 1 - i; j++){
                if (nums[j] > nums[j + 1]){
                    swap(nums, j, j + 1);
                    hasSwap = true;
                }
            }
        }
    }

    public void bubbleSort2(int[] nums){
        if (nums == null || nums.length <= 1){
            return;
        }
        int n = nums.length;
        boolean hasSwap = true;
        int lastSwapIdx = n - 1;
        int tmp = lastSwapIdx;
        while(hasSwap){
            hasSwap = false;
            tmp = lastSwapIdx;
            for(int i = 0; i < lastSwapIdx; i++){
                if (nums[i] > nums[i + 1]){
                    swap(nums, i, i + 1);
                    hasSwap = true;
                    tmp = i;
                }
            }
            lastSwapIdx = tmp;
        }
    }

    private void swap(int[] nums, int i, int j){
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
}
