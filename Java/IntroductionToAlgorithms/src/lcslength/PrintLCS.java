package lcslength;

/**
 * @author : Qingfeng
 * @date : 2018/6/27
 */
public class PrintLCS {
    public void printLCS(int[][] LCSPrintResult, String s1, int i, int j){
        if (i == 0 || j == 0){
            return;
        }

        if (LCSPrintResult[i][j] == 1){
            printLCS(LCSPrintResult, s1, i - 1, j - 1);
            System.out.print(s1.charAt(i - 1));
        }
        else if (LCSPrintResult[i][j] == 2){
            printLCS(LCSPrintResult, s1, i - 1, j);
        }
        else {
            printLCS(LCSPrintResult, s1, i, j - 1);
        }
    }
}
