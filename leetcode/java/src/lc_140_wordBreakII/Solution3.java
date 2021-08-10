package lc_140_wordBreakII;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution3 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0 || wordDict.size() == 0 || !canWordBreak(s, wordDict)){
            return new LinkedList<String>();
        }
        Set<String> hashSet = new HashSet<>(wordDict);
        List<String>[] dps = new LinkedList[s.length() + 1];
        List<String> zero = new LinkedList<>();
        zero.add("");
        dps[0] = zero;
        for(int end=1; end <= s.length(); end++){
            List<String> temp = new LinkedList<>();
            for(int start=0; start < end; start++){
                if (dps[start].size() > 0 && hashSet.contains(s.substring(start, end))){
                    for(String l: dps[start]){
                        temp.add(l + (l.equals("") ? "" : " ") + s.substring(start, end));
                    }
                }
            }
            dps[end] = temp;
        }
        return dps[s.length()];
    }

    public boolean canWordBreak(String s, List<String> wordDict) {
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
