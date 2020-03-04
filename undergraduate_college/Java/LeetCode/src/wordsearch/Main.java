package wordsearch;

/**
 * @author : Qingfeng
 * @date : 2018/8/19
 */
public class Main {
    public static void main(String[] args){
        WordSearch wordSearch = new WordSearch();
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String str = "ABCB";

        System.out.println(wordSearch.exist(board, str));
    }
}
