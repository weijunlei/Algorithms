package lc_189_rotate;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(nums, 3);
        for(int num: nums){
            System.out.print(String.valueOf(num) + "\t");
        }
        System.out.println();
    }
}
