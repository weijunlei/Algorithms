package lcslength;

/**
 * @author : Qingfeng
 * @date : 2018/6/27
 */
public class LCSLength {
    public Result lcsLength(String s1, String s2){
        Result result = new Result();
        if (s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0){
            return result;
        }

        int[][] LCSResult = new int[s1.length() + 1][ s2.length() + 1];
        int[][] LCSPrintResult = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i < s1.length() + 1; i++){
            LCSResult[i][0] = 0;
        }
        for(int j = 0; j < s2.length() + 1; j++){
            LCSResult[0][j] = 0;
        }
        char[] charList1 = s1.toCharArray();
        char[] charList2 = s2.toCharArray();

        for(int i = 1; i < s1.length() + 1; i++){
            for(int j = 1; j < s2.length() + 1; j++){
                if (charList1[i - 1] == charList2[j - 1]){
                    LCSResult[i][j] = LCSResult[i - 1][j-1] + 1;
                    LCSPrintResult[i][j] = 1;
                }
                else if(LCSResult[i - 1][j] >= LCSResult[i][j-1]){
                    LCSResult[i][j] = LCSResult[i-1][j];
                    LCSPrintResult[i][j] = 2;
                }
                else{
                    LCSResult[i][j] = LCSResult[i][j - 1];
                    LCSPrintResult[i][j] = 3;
                }
            }
        }

        return new Result(LCSResult, LCSPrintResult);
    }
}
