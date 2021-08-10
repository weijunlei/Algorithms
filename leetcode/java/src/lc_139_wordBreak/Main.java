package lc_139_wordBreak;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        String testStr = "leetcode";
        String[] strList = {"a", "cod", "leet"};
        List<String> strDict = new LinkedList<>();
        for(String str: strList) {
            strDict.add(str);
        }
        System.out.println(testStr + " is in word dict: " + strDict.toString() + solution.wordBreak(testStr, strDict));
    }
}
