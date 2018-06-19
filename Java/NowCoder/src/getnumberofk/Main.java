package getnumberofk;

/**
 * @author : Qingfeng
 * @date : 2018/6/19
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,5,5,5,5,6,7,8};
        ComplexGetNumberOfK complexGetNumberOfK = new ComplexGetNumberOfK();
        GetNumberOfK getNumberOfK = new GetNumberOfK();
        System.out.println(complexGetNumberOfK.GetNumberOfK(nums, 5));
        System.out.println(complexGetNumberOfK.GetNumberOfK(nums, 5));
    }
}
