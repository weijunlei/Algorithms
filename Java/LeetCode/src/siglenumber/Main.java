package siglenumber;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 */
public class Main {
    public static void main(String[] args){
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber.sigleNumber(nums));
    }
}
