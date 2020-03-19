package lc_139_wordBreak;

import java.util.HashSet;
import java.util.List;

public class Solution2 {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) {
            return true;
        } else if (wordDict.size() == 0) {
            return false;
        }
        HashSet<String> hashSet = new HashSet<>(wordDict);
        return wordBreakHelper(s, 0, hashSet, new Boolean[s.length()]);
    }

    private boolean wordBreakHelper(String neededStr, int startIndex, HashSet<String> hashSet, Boolean[] hasMatch) {
        if (startIndex == neededStr.length()) {
            return true;
        }
        if (hasMatch[startIndex] != null) {
            return hasMatch[startIndex];
        }
        for(int i=startIndex + 1; i <= neededStr.length(); i++) {
            if (hashSet.contains(neededStr.substring(startIndex, i)) && wordBreakHelper(neededStr, i, hashSet, hasMatch)) {
                return hasMatch[startIndex] = true;
            }
        }
        return hasMatch[startIndex] = false;
    }
}
