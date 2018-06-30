package firstappearingonce;

import java.util.HashMap;

/**
 * @author : Qingfeng
 * @date : 2018/6/30
 */
public class FirstAppearingOnce {
    public char firstAppearingOnce(String string){
        if (string == null || string.length() == 0){
            return '#';
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char i : string.toCharArray()){
            if (hashMap.containsKey(i)){
                hashMap.put(i, hashMap.get(i) + 1);
            }
            else{
                hashMap.put(i, 1);
            }
        }

        for(char i : string.toCharArray()){
            if (hashMap.get(i) == 1){
                return i;
            }
        }

        return '#';
    }
}
