package lc_140_wordBreakII;

import java.util.*;

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new LinkedList<>();
        if (s == null || s.length() == 0 || wordDict.size() == 0){
            return result;
        }
        Set<String> hashSet = new HashSet<>(wordDict);
        boolean[] dps = new boolean[s.length() + 1];
        dps[0] = true;
        for(int end=1; end < s.length() + 1; end++){
            for(int start=0; start < end; start++) {
                if(dps[start] && hashSet.contains(s.substring(start, end))) {
                    dps[end] = true;
                    break;
                }
            }
        }
        if (!dps[s.length()]) {
            return result;
        }

        List<String> temp = new LinkedList<>();
        wordBreakHelper(s, hashSet, s.length(), dps, temp, result);
        return result;
    }

    private void wordBreakHelper(String s, Set<String> hashSet, int endIndex, boolean[] dps, List<String> temp, List<String> result) {
        if (endIndex == 0) {
            StringBuilder sb = new StringBuilder();
            for(int i = temp.size() - 1; i >= 0; i--){
                if (i != temp.size() - 1) {
                    sb.append(" ");
                }
                sb.append(temp.get(i));
            }
            result.add(sb.toString());
        }
        for(int i=endIndex - 1; i >= 0; i--) {
            if (dps[i] && hashSet.contains(s.substring(i, endIndex))){
                temp.add(s.substring(i, endIndex));
                wordBreakHelper(s, hashSet, i, dps, temp, result);
                temp.remove(temp.size() - 1);
            }
        }
    }
}