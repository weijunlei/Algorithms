package LongesetSubstringWRC;

import java.util.HashMap;
import java.util.Map;

public class MySolution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null)
            return 0;
        int start = 0;
        int result = 0;
        Map<Character, Integer> map = new HashMap(s.length());

        for (int i = 0; i < s.length(); i ++)
        {
            char temp_ch = s.charAt(i);
            if (map.containsKey(temp_ch) && map.get(temp_ch) >= start)
                start = map.get(temp_ch) + 1;
            else
                result = Math.max(result, i - start + 1);
            map.put(temp_ch, i);
        }

        return result;
    }
}
