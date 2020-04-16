package lc_324_wiggleSort;

class Solution2 {
    public void wiggleSort(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1){
            return;
        }
        int mid = (nums.length + 1) / 2;
        if (nums.length > 1){
            quickSelect(nums, 0, nums.length - 1, mid, false);
        }
        int midNum = nums[mid];
        int midIndex = 0, k = nums.length - 1, iterIndex =0;
        while (midIndex < k){
            if (nums[midIndex] > midNum){
                swap(nums, midIndex, k);
                k --;
            }else if(nums[midIndex] < midNum){
                swap(nums, midIndex, iterIndex);
                midIndex++;
                iterIndex++;
            }else{
                midIndex++;
            }
        }
        int[] smallNums = new int[mid];
        int[] bigNums = new int[nums.length - mid];
        for(int i = 0; i < nums.length; i++){
            if (i < mid){
                smallNums[i] = nums[mid - 1 - i];
            }else{
                bigNums[i - mid] = nums[nums.length - 1 - (i - mid)];
            }
        }
        for(int i = 0; i < nums.length; i++){
            if (i % 2 == 0){
                nums[i] =  smallNums[i / 2];
            }else{
                nums[i] = bigNums[i / 2];
            }
        }
    }

    private void quickSelect(int[] nums,int start,int end,int k, boolean reverse){
        int getIndex = getPartition(nums, start, end, reverse);
        while (getIndex != k){
            if (getIndex > k){
                getIndex = getPartition(nums, start, getIndex - 1, reverse);
            }
            if (getIndex < k){
                getIndex = getPartition(nums, getIndex + 1, end, reverse);
            }
        }
    }

    private int getPartition(int[] nums, int start, int end, boolean reverse){
        int getNum = nums[start];
        int getIndex = start;
        swap(nums, start, end);
        for(int i = start; i < end; i++){
            if ((!reverse && nums[i] < getNum) || (reverse && nums[i] > getNum)){
                swap(nums, getIndex++, i);
            }
        }
        swap(nums, getIndex, end);
        return getIndex;
    }


    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
