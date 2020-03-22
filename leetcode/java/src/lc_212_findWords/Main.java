package lc_212_findWords;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        char[][] board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
        String[] words = {"oath","pea","eat","rain"};
        List<String> res = new LinkedList<>();
        res = solution.findWords(board, words);
        for (String s: res){
            System.out.println(s);
        }

    }
}
