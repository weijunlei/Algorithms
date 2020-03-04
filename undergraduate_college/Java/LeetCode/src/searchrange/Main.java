package searchrange;

/**
 * @author : Qingfeng
 * @date : 2018/8/27
 */
public class Main {
    public static void main(String[] args){
        SearchRange searchRange = new SearchRange();
        int[] nums = {5,7,7,8,8,10};

        int[] result = searchRange.searchRange(nums, 8);

       for(int i : result){
           System.out.println(i);
       }
    }
}
