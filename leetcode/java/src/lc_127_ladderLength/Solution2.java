package lc_127_ladderLength;

import java.util.*;

class Solution2 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (beginWord == null || beginWord.length() == 0 || endWord == null || endWord.length() == 0 || wordList == null || wordList.size() == 0){
            return 0;
        }
        Map<String, List<String>> wordDict = new HashMap<>();
        Map<String, Integer> beginVisit = new HashMap<>();
        Map<String, Integer> endVisit = new HashMap<>();
        Queue<String> beginQueue = new LinkedList<>();
        Queue<String> endQueue = new LinkedList<>();

        beginVisit.put(beginWord, 1);
        endVisit.put(endWord, 1);
        beginQueue.offer(beginWord);
        endQueue.offer(endWord);
        boolean hasEndWord = false;

        for(String word: wordList){
            int l = word.length();
            if (word.equals(endWord)){
                hasEndWord = true;
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
        System.out.println(hasEndWord);
        if (!hasEndWord){
            return 0;
        }

        while(!beginQueue.isEmpty() && !endQueue.isEmpty()){
            int getSame = updateQueue(wordDict, beginQueue, beginVisit, endVisit);
            if (getSame != -1){
                return getSame;
            }
            getSame = updateQueue(wordDict, endQueue, endVisit, beginVisit);
            if (getSame != -1){
                return getSame;
            }
        }
        return 0;
    }

    private int updateQueue(Map<String, List<String>> wordDict, Queue<String> queue, Map<String, Integer> visit, Map<String, Integer> visit1){
        String getStr = queue.remove();
        int l = getStr.length();
        int getLever = visit.get(getStr);
        for(int i = 0; i < l; i++){
            String tempStr = getStr.substring(0, i) + "*" + getStr.substring(i + 1, l);
            if (!wordDict.containsKey(tempStr) || wordDict.get(tempStr).size() == 0){
                continue;
            }
            for(String getWord: wordDict.get(tempStr)){
                if (!visit.containsKey(getWord)){
                    if (visit1.containsKey(getWord)){
                        return getLever + visit1.get(getWord);
                    }
                    queue.offer(getWord);
                    visit.put(getWord, getLever + 1);
                }
            }
        }
        return -1;
    }
}
