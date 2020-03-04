package sum;

/**
 * @author : Qingfeng
 * @date : 2018/6/28
 */
public class Sum {
    public int sum(int n){
        int sum = n;
        boolean canStop = (n > 0) && ((sum += sum(n - 1)) > 0);
        return sum;
    }
}
