package trailingzeros;

/**
 * @author : Qingfeng
 * @date : 2018/8/29
 * 阶乘后的零
 */
public class TrailingZeros {
    public int trailingZeros(int n){
        int result = 0;

        while (n != 0){
            result += n / 5;
            n /= 5;
        }

        return result;
    }
}
