package lc_88_merge;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int mIndex = m - 1;
        int nIndex = n - 1;
        int allIndex = m + n - 1;

        while (mIndex >= 0 || nIndex >= 0) {
            if (nIndex < 0 || (mIndex >= 0 && nums1[mIndex] >= nums2[nIndex])) {
                nums1[allIndex--]  = nums1[mIndex--];
            } else if(mIndex < 0 || (nIndex >= 0 && nums2[nIndex] > nums1[mIndex])) {
                nums1[allIndex--] = nums2[nIndex--];
            }
        }

    }
}
