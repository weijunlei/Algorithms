package lc_30;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        List<Integer> result = solution.findSubstring(s, words);
        for(int num: result){
            System.out.println(num);
        }
    }
}
