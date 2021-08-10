package lc_139_wordBreak;

import java.util.HashSet;
import java.util.List;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) {
            return true;
        } else if (wordDict.size() == 0) {
            return false;
        }
        HashSet<String> hashSet = new HashSet<>(wordDict);
        return wordBreakHelper(s, 0, hashSet);

    }

    private boolean wordBreakHelper(String s, int startIndex, HashSet<String> hashSet) {
        if (startIndex >= s.length()) {
            return true;
        }
        boolean hasMatch = false;
        for(String neededStr: hashSet) {
//            System.out.println(s.substring(startIndex, startIndex + neededStr.length()));
            if (startIndex + neededStr.length() <= s.length() && s.substring(startIndex, startIndex + neededStr.length()).equalsIgnoreCase(neededStr)) {
                hasMatch = hasMatch || wordBreakHelper(s, startIndex + neededStr.length(), hashSet);
                if (hasMatch) {
                    break;
                }
            }
        }
        return hasMatch;
    }
}
