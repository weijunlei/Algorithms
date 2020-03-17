package lc_131_partition;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new LinkedList<>();
        if (s.length() == 0) {
            return res;
        }
        List<String> temp = new LinkedList<>();
        partitionHelper(res, s, 0, temp);
        return res;
    }

    private boolean canReverse(String s, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (s.charAt(i++) == s.charAt(j--)) {
            return canReverse(s, i, j);
        } else {
            return false;
        }
    }

    private void partitionHelper(List<List<String>> res, String s, int startIndex, List<String> temp) {
        int size = s.length();
        if (startIndex >= size) {
            res.add(new LinkedList<>(temp));
            return;
        }
        for(int i = startIndex; i < size; i++) {
            if (canReverse(s, startIndex, i)) {
                temp.add(s.substring(startIndex, i + 1));
                partitionHelper(res, s, i + 1, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
