package getuglynumber;

/**
 * @author : Qingfeng
 * @date : 2018/6/13
 */
public class Main {
    public static void main(String[] args) {
        GetUglyNumber getUglyNumber = new GetUglyNumber();
        System.out.println(getUglyNumber.getUglyNumber(9));
        for(int i = 1; i < 100; i ++) {
            System.out.println(getUglyNumber.getUglyNumber(i));
        }
    }
}
