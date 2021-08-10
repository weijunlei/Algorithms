package lc_131_partition;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        List<List<String>> res = solution.partition("abb");
        for(List temp: res) {
            System.out.println(temp.toString());
        }
    }
}
