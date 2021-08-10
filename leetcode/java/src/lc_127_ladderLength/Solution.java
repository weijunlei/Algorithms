package lc_127_ladderLength;

import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (beginWord == null || beginWord.length() == 0 || endWord == null || endWord.length() == 0 || wordList == null || wordList.size() == 0){
            return 0;
        }
        Map<String, List<String>> wordDict = new HashMap<>();
        Map<String, Boolean> hasVisit = new HashMap();
        Queue<Map<String, Integer>> queue = new LinkedList<>();
        hasVisit.put(beginWord, true);
        queue.offer(new HashMap<String, Integer>(){{put(beginWord, 1);}});
        for(String word: wordList){
            int l = word.length();
            if (!word.equals(beginWord)){
                hasVisit.put(word, false);
            }

            for(int i = 0; i < l; i++){
                String tempStr = word.substring(0, i) + "*" + word.substring(i + 1, l);
                if (!wordDict.containsKey(tempStr)){
                    wordDict.put(tempStr, new ArrayList<String>());
                }
                List<String> tempList = wordDict.get(tempStr);
                tempList.add(word);
                wordDict.put(tempStr, tempList);
            }
        }
        while(!queue.isEmpty()){
            Map<String, Integer> node = queue.remove();
            String word = node.keySet().toArray()[0].toString();
            int getLevel = node.get(word);
            if (word.equals(endWord)){
                return getLevel;
            }
            int l = word.length();
            for(int i = 0; i < l; i++){
                String tempStr = word.substring(0, i) + "*" + word.substring(i + 1, l);
                if (wordDict.get(tempStr) == null || wordDict.get(tempStr).size() == 0){
                    continue;
                }
                for(String getWord: wordDict.get(tempStr)){
                    if (getWord.equals(endWord)){
                        return getLevel + 1;
                    }
                    if (!hasVisit.get(getWord)){
                        queue.offer(new HashMap<String, Integer>(){{put(getWord, getLevel + 1);}});
                        hasVisit.put(getWord, true);
                    }
                }
            }
        }
        return 0;

    }
}
