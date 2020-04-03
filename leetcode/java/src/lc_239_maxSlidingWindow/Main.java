package lc_239_maxSlidingWindow;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] result = solution.maxSlidingWindow(nums, 3);
        for(int num: result){
            System.out.printf("%d\t", num);
        }
        System.out.println();
    }
}
