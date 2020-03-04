package inversepairs;

/**
 * @author : Qingfeng
 * @date : 2018/6/19
 */
public class Main {
    public static void main(String[] args) {
        ComplexInversePairs complexInversePairs = new ComplexInversePairs();
        InversePairs inversePairs = new InversePairs();
        int[] nums = {1,2,3,4,5,6,7,0};

        System.out.println(complexInversePairs.inversePairs(nums));
        System.out.println(inversePairs.inversePairs(nums));
    }
}
