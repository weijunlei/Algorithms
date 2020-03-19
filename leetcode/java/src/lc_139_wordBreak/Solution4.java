package lc_139_wordBreak;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution4 {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) {
            return true;
        } else if(wordDict.size() == 0) {
            return false;
        }
        Set<String> hashSet = new HashSet<>(wordDict);
        boolean[] dps = new boolean[s.length() + 1];
        dps[0] = true;

        for(int end = 1; end < s.length() + 1; end++) {
            for(int start=0; start < end; start++) {
                if (dps[start] && hashSet.contains(s.substring(start, end))) {
                    dps[end] = true;
                    break;
                }
            }
        }
        return dps[s.length()];
    }
}
