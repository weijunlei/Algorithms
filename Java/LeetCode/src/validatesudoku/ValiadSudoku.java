package validatesudoku;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 * 有效的数独
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/30/
 */
public class ValiadSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0){
            return false;
        }

        boolean[] numsMark = new boolean[9];

        // rows
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < 9; j++){
                numsMark[j] = false;
            }

            for(int j = 0; j < 9; j++){
                if (board[i][j] == '.'){
                    continue;
                }
                if (numsMark[board[i][j] - '1']){
                    return false;
                }else{
                    numsMark[board[i][j] - '1'] = true;
                }
            }
        }

        // columns
        for(int i = 0; i < board[0].length; i++){
            for(int j = 0; j < 9; j++){
                numsMark[j] = false;
            }

            for(int j = 0; j < 9; j++){
                if (board[j][i] == '.'){
                    continue;
                }
                if (numsMark[board[j][i] - '1']){
                    return false;
                }else{
                    numsMark[board[j][i] - '1'] = true;
                }
            }
        }

        // region
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                numsMark[j] = false;
            }

            for(int j = 0; j < 9; j++){
                int rowIndex = (i / 3) * 3 + j / 3;
                int colIndex = j % 3 + (i % 3) * 3;
                if (board[rowIndex][colIndex] == '.'){
                    continue;
                }
                if (numsMark[board[rowIndex][colIndex] - '1']){
                    return false;
                }else{
                    numsMark[board[rowIndex][colIndex] - '1'] = true;
                }
            }
        }

        return true;
    }
}
