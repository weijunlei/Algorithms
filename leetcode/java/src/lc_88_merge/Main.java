package lc_88_merge;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        for(int i = 0; i < 100000000; i++){
            int idx = (int)((10 - 1 + 1) * Math.random()) + 1;
            System.out.printf("idx: %d\n", idx);
        }

        int[] nums1 = {1, 2, 2, 3,4, 0, 0, 0};
        int[] num2 = {1, 2, 3};
        double a = 5.0;
        double b = 2.0;
        double c = Math.ceil(a / b);
        solution.merge(nums1, 5, num2, 3);
        for(int i: nums1) {
            System.out.print(i + "\t");
        }
    }
}
