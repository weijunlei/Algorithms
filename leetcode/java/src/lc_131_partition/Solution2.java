package lc_131_partition;

import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new LinkedList<>();
        if (s.length() == 0) {
            return res;
        }
        int size = s.length();
        boolean[][] dps = new boolean[size][size];
        for(int right = 0; right < size; right++) {
            for(int left = 0; left <= right; left++) {
                if (s.charAt(left) == s.charAt(right) && (right - left <= 2 || dps[left + 1][right - 1])) {
                    dps[left][right] = true;
                }
            }
        }

        List<String> temp = new LinkedList<>();
        partitionHelper(res, s, 0, temp, dps);
        return res;
    }

    private void partitionHelper(List<List<String>> res, String s, int startIndex, List<String> temp, boolean[][] dps) {
        int size = s.length();
        if (startIndex >= size) {
            res.add(new LinkedList<>(temp));
            return;
        }
        for(int i = startIndex; i < size; i++) {
            if (dps[startIndex][i]) {
                temp.add(s.substring(startIndex, i + 1));
                partitionHelper(res, s, i + 1, temp, dps);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
