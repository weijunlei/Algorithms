package lc_242_anagram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean isAnagram(String s, String t) {
        if ((s == null && t != null) || (s != null && t == null) || s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> chMap = new HashMap<>();
        for(char ch: s.toCharArray()){
            if (!chMap.containsKey(ch)){
                chMap.put(ch, 1);
            }
            chMap.put(ch, chMap.get(ch) + 1);
        }
        for(char ch: t.toCharArray()){
            if(!chMap.containsKey(ch) || chMap.get(ch) != 0){
                return false;
            } else{
                chMap.put(ch, chMap.get(ch) - 1);
            }
        }
        return true;
    }
}
