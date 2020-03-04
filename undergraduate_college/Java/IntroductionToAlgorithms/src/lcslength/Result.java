package lcslength;

import java.util.ArrayList;

/**
 * @author : Qingfeng
 * @date : 2018/6/27
 */
public class Result {
    public int[][] LCSStruct;
    public int[][] LCSPrintStruct;

    public Result(){
        int[][] LCSStruct = null;
        int[][] LCSPrintStruct = null;
    }

    public Result(int[][] LCSStruct, int[][] LCSPrintStruct){
        this.LCSStruct = LCSStruct;
        this.LCSPrintStruct = LCSPrintStruct;
    }
}
