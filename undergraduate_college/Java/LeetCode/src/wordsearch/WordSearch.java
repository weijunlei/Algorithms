package wordsearch;

/**
 * @author : Qingfeng
 * @date : 2018/8/19
 * 题目：单词搜索
 * 题目链接：https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/49/backtracking/95/
 */
public class WordSearch {
    public boolean exist(char[][] board, String word){
        if (board == null || board.length == 0 || board[0].length == 0){
            return false;
        }

        boolean result = false;
        boolean[][] isSearched = new boolean[board.length][board[0].length];

        for(int i = 0;  i < board.length; i ++){
            for(int j = 0; j < board[0].length; j++){
                result = existHelper(board, i, j, word, 0, isSearched);
                if (result) {
                    return result;
                };
            }
        }
        return result;
    }

    private boolean existHelper(char[][] board, int i, int j, String word, int index, boolean[][] isSearch){
        if (board[i][j] == word.charAt(index) && index == word.length() - 1 && isSearch[i][j] == false){
            return true;
        }
        if (board[i][j] != word.charAt(index) || isSearch[i][j] == true){
            return false;
        }else{
            boolean result = false;
            isSearch[i][j] = true;
            if (i - 1 >= 0){
                result = (result || existHelper(board, i - 1, j, word, index + 1, isSearch));
            }
            if (i + 1 < board.length){
                result = (result || existHelper(board, i + 1, j, word, index + 1, isSearch));
            }
            if (j - 1 >= 0){
                result = result = (result || existHelper(board, i, j - 1, word, index + 1, isSearch));
            }
            if (j + 1 < board.length){
                result = result = (result || existHelper(board, i, j + 1, word, index + 1, isSearch));
            }
            // 关键回溯
            isSearch[i][j] =false;
            return result;
        }
    }
}
