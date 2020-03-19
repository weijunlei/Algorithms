package lc_139_wordBreak;

import java.util.*;

public class Solution3 {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) {
            return true;
        } else if(wordDict.size() == 0) {
            return false;
        }
        Set<String> hashSet = new HashSet<>(wordDict);
        Queue<Integer> queue = new LinkedList<>();
        boolean[] hasSeen = new boolean[s.length()];
        queue.add(0);
        while (!queue.isEmpty()) {
            int startIndex = queue.remove();
            if (!hasSeen[startIndex]) {
                for(int endIndex = startIndex + 1; endIndex <= s.length(); endIndex++) {
                    if (hashSet.contains(s.substring(startIndex, endIndex))) {
                        queue.add(endIndex);
                        if (endIndex == s.length()) {
                            return true;
                        }
                    }
                }
                hasSeen[startIndex] = true;
            }
        }
        return false;
    }
}
