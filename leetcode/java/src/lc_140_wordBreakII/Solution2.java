package lc_140_wordBreakII;

import java.util.*;

public class Solution2 {
    Map<Integer, List<String>> hashMap = new HashMap<>();
    public List<String> wordBreak(String s, List<String> wordDict){
        List<String> result = new LinkedList<>();
        if (s == null || s.length() == 0 || wordDict.size() == 0){
            return result;
        }
        return wordBreakHelper(s, new HashSet<>(wordDict), 0);
    }

    private List<String> wordBreakHelper(String s, Set<String> hashSet, int startIndex) {
        if (hashMap.containsKey(startIndex)) {
            return hashMap.get(startIndex);
        }
        List<String> temp = new LinkedList<>();
        // 标记是否可以完全切分
        if (startIndex == s.length()) {
            temp.add("");
        }
        for(int end=startIndex+1; end <= s.length(); end++){
            if(hashSet.contains(s.substring(startIndex, end))){
                List<String> list = wordBreakHelper(s, hashSet, end);
                for(String l: list){
                    if (l.equals("")){
                        temp.add(s.substring(startIndex, end));
                    } else{
                        temp.add(s.substring(startIndex, end) + " " + l);
                    }
                }
            }
        }
        hashMap.put(startIndex, temp);
        return temp;
    }
}
