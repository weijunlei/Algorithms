package lc_31;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {3, 2, 1};
        solution.nextPermutation(nums);
        for(int num: nums){
            System.out.printf("%d\t", num);
        }
    }
}
