package matrixchainorder;

/**
 * @author : Qingfeng
 * @date : 2018/6/27
 */
public class PrintOptimalParens {
    public void printOptimalParens(int[][] s, int i, int j){
        if (i == j){
            System.out.format("A%d", i);
        }

        else{
            System.out.print("(");
            printOptimalParens(s, i, s[i][j]);
            printOptimalParens(s, s[i][j] + 1, j);
            System.out.print(")");
        }
    }
}
