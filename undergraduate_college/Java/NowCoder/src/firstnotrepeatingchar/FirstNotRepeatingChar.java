package firstnotrepeatingchar;

import java.util.HashMap;

/**
 * @author : Qingfeng
 * @date : 2018/6/13
 */
public class FirstNotRepeatingChar {
    public int firstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }

        char[] charList = str.toCharArray();
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < charList.length; i ++) {
            if (map.containsKey(charList[i])) {
                map.put(charList[i], map.get(charList[i]) + 1);
            }
            else{
                map.put(charList[i], 1);
            }
        }

        for (int i = 0;i < charList.length; i ++) {
            if (map.get(charList[i]) == 1) {
                result = i;
                break;
            }
        }

        return result;
    }
}
