package lc_300_lengthOfLIS;

class Solution2 {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int n = nums.length;
        int[] dps = new int[n + 1];
        int len = 1;
        dps[1] = nums[0];
        for(int i = 1; i < n; i++){
            if (nums[i] > dps[len]){
                dps[++len] = nums[i];
                continue;
            }
            int left  = 1, right = len;
            int origin = 0;
            while(left <= right){
                int mid = (left + right) / 2;
                if (dps[mid] < nums[i]){
                    origin = mid;
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            dps[origin + 1] = nums[i];
        }
        return len;
    }
}
