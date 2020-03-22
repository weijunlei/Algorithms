package lc_212_findWords;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new LinkedList<>();
        if (words.length == 0 || board.length == 0 || board[0].length == 0){
            return result;
        }
        for(String word: words){
            if(hasWord(word, board)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean hasWord(String s, char[][] board){
        boolean canFind = false;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if (s.charAt(0) == board[i][j] && wordDFS(s, board, 0, i, j)) {
                    canFind = true;
                    break;
                }
            }
            if (canFind){
                break;
            }
        }
        return canFind;
    }

    private boolean wordDFS(String s, char[][] board, int startIndex, int i, int j){
        if (startIndex == s.length() - 1){
            return true;
        }
        boolean canFind = false;
        char temp = s.charAt(startIndex);
        char getCh = s.charAt(startIndex + 1);
        board[i][j] = '$';
        if(canGetCh(getCh, board, i + 1, j)){
            canFind = canFind || wordDFS(s, board, startIndex+1, i+1, j);
            if (canFind){
                board[i][j] = temp;
            }
        }
        if (!canFind && canGetCh(getCh, board, i -1, j)){
            canFind = canFind || wordDFS(s, board, startIndex+1, i-1, j);
            if (canFind){
                board[i][j] = temp;
            }
        }
        if (!canFind && canGetCh(getCh, board, i, j+1)){
            canFind = canFind || wordDFS(s, board, startIndex+1, i, j+1);
            if (canFind){
                board[i][j] = temp;
            }
        }
        if (!canFind && canGetCh(getCh, board, i, j-1)){
            canFind = canFind || wordDFS(s, board, startIndex+1, i, j-1);
            if (canFind){
                board[i][j] = temp;
            }
        }
        board[i][j] = temp;
        return canFind;
    }

    private boolean canGetCh(char getCh, char[][] board, int i, int j){
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length){
            return false;
        }
        return board[i][j] == getCh;
    }
}
