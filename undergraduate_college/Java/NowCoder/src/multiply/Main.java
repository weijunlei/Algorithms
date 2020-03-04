package multiply;

/**
 * @author : Qingfeng
 * @date : 2018/6/28
 */
public class Main {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6};
        Multiply multiply = new Multiply();
        int[] B = multiply.multiply(nums);
        for(int i : B){
            System.out.format("%d\t", i);
        }
    }
}
