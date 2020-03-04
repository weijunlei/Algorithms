package happynum;

import java.util.HashMap;

/**
 * @author : Qingfeng
 * @date : 2018/8/29
 */
public class IsHappy {
    public boolean isHappy(int n){
        if (n == 1){
            return true;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(n, 1);

        while(n != 1){
            n = countSquare(n);
            if (map.containsKey(n)){
                return false;
            }
            map.put(n, 1);
        }

        return false;
    }

    private int countSquare(int n){
        int result = 0;
        while (n != 0){
            result += (n % 10) * (n % 10);
            n /= 10;
        }

        return result;
    }
}
