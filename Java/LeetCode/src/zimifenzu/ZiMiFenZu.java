package zimifenzu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author : Qingfeng
 * @date : 2018/7/19
 */
public class ZiMiFenZu {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length == 0){
            return result;
        }

        HashMap<String, Integer>  map = new HashMap<>();
        for(String str : strs){
            char[] chs = str.toCharArray();
            Arrays.sort(chs);
            String tempStrKey = String.valueOf(chs);
            if (!map.containsKey(tempStrKey)){
                map.put(tempStrKey, result.size() + 1);
                List<String> strResult = new ArrayList<>();
                strResult.add(str);
                result.add(strResult);
            }
            else{
//                System.out.println(map.get(tempStrKey));
//                System.out.println(result.get(map.get(tempStrKey) - 1));
                result.get(map.get(tempStrKey) - 1).add(str);
            }
        }

        return result;
    }
}
