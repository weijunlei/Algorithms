package findkthlargest;

/**
 * @author : Qingfeng
 * @date : 2018/8/21
 */
public class Main {
    public static void main(String[] args){
        FindKthLargest findKthLargest = new FindKthLargest();
        int[] nums = {2, 1, 5, 3, 4,6};
        System.out.println(findKthLargest.findKthLargest(nums, 2));
    }
}
