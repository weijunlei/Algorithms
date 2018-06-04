package ReverseInteger;

/**
 * Created by IntelliJ IDEA
 * User: lei11
 * Date: 2018/3/13
 * TIME: 23:14
 * PROJECTNAME: myjava
 **/
public class MySolution {
    public int reverse(int x)
    {
        int result = 0;
        boolean isPositive = true;
        if (x > Math.pow(2, 30) - 1)
            return result;
        if (x < 0)
        {
            x = -x;
            isPositive = false;
        }
        while( x != 0)
        {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        if (!isPositive)
            result = - result;
        return result;
    }
}
