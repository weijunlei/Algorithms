package lc_88_merge;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 2, 3,4, 0, 0, 0};
        int[] num2 = {1, 2, 3};
        solution.merge(nums1, 5, num2, 3);
        for(int i: nums1) {
            System.out.print(i + "\t");
        }
    }
}
