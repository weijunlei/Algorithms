package iscontinuous;

/**
 * @author : Qingfeng
 * @date : 2018/6/20
 */
public class Main {
    public static void main(String[] args) {
        IsContinus isContinus = new IsContinus();
        int[] nums = {1,3,4,5,6};

        System.out.println(isContinus.isContinuous(nums));
    }
}
