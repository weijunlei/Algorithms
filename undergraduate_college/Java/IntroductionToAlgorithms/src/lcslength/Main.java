package lcslength;

/**
 * @author : Qingfeng
 * @date : 2018/6/27
 */
public class Main {
    public static void main(String[] args){
        LCSLength lcsLength = new LCSLength();
        Result result = lcsLength.lcsLength("ABCBDAB", "BDCABA");

        for(int i = 1; i < result.LCSStruct.length; i++){
            for(int j = 1; j < result.LCSStruct[0].length; j++){
                System.out.format("%d\t", result.LCSStruct[i][j]);
            }
            System.out.println();
        }

        PrintLCS printLCS = new PrintLCS();
        printLCS.printLCS(result.LCSPrintStruct, "ABCBDAB", 7, 6);
    }
}
