package lc_131_partition;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<String>> res = solution.partition("abb");
        for(var temp: res) {
            System.out.println(temp.toString());
        }
    }
}
