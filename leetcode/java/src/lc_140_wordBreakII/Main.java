package lc_140_wordBreakII;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Solution3 solution = new Solution3();
        String testStr = "catsandog";
        String[] strList = {"cats", "dog", "san", "and", "cat"};
        List<String> strDict = new LinkedList<>();
        for(String str: strList) {
            strDict.add(str);
        }
        List<String> result = solution.wordBreak(testStr, strDict);
        for(String res: result){
            System.out.println(res);
        }
    }
}
