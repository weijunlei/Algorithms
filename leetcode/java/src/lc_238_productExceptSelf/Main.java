package lc_238_productExceptSelf;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);
        for(int num: result){
            System.out.printf("%d\t", num);
        }
    }
}
