package lc_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0){
            return result;
        }

        int m = s.length();
        int n = words[0].length();

        Map<String, Integer> map = new HashMap<>();
        for(String word: words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        Map<String, Integer> tmpMap = new HashMap<>();
        for(int i = 0; i <= m - n; i++){
            tmpMap = new HashMap<>();
            int startIdx = i;
            int wordCount = 0;
            while(startIdx <= m - n){
                String newWord = s.substring(startIdx, startIdx + n);
                if (map.containsKey(newWord) && tmpMap.getOrDefault(newWord, 0) + 1 <= map.get(newWord)){
                    tmpMap.put(newWord, tmpMap.getOrDefault(newWord, 0) + 1);
                    wordCount += 1;
                    startIdx += n;
                }else{
                    break;
                }
            }
            if (wordCount == words.length){
                result.add(i);
            }
        }

        return result;
    }
}