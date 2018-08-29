package mysqrt;

/**
 * @author : Qingfeng
 * @date : 2018/8/29
 */
public class MySqrt {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;
        if (x == 1)
            return 1;

        int left = 1;
        int right = x;
        int mid = 0;

        while (right >= left){

            mid = (right - left) / 2 + left;
            if ((x / mid == mid) || (x / mid > mid && x / (mid + 1) < (mid + 1)))
                return mid;
            if (x / mid < mid){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return mid;
    }
}
