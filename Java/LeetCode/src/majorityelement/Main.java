package majorityelement;

/**
 * @author : Qingfeng
 * @date : 2018/8/30
 */
public class Main {
    public static void main(String[] args){
        int[] nums = {3, 2, 3};
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(nums));
    }
}
