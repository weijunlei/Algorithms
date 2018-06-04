package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class MySolution {
    public int romanToint(String s)
    {
        Map<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);

        int total = romanToIntMap.get(s.charAt(0));
        int pre,cur;
        for (int i=1; i < s.length(); i++)
        {
            pre = romanToIntMap.get(s.charAt(i - 1));
            cur = romanToIntMap.get(s.charAt(i));

            if (cur <= pre)
                total += cur;
            else
                total += cur - 2 * pre;
        }

        return total;
    }
}
