package PalindromeNumber;

/**
 * Created by IntelliJ IDEA
 * User: lei11
 * Date: 2018/3/14
 * TIME: 22:22
 * PROJECTNAME: myjava
 **/
public class Solution {
    public boolean isPalindrome(int x) {
        int result = 0;
        int newResult = 0;
        int originX = x;
        if (x < 0)
            return false;
        while (x != 0)
        {
            newResult = result * 10 + x % 10;
            if (((newResult - x % 10)) / 10 != result)
                return false;
            result = newResult;
            x /= 10;
        }
        return result == originX;
    }
}
