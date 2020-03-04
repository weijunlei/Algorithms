package verifysequenceofbst;

/**
 * @author : Qingfeng
 * @date : 2018/6/4
 */

public class VerifySequenceOfBST {
    public boolean verifySequenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }

        int seqLength = sequence.length;
        while (seqLength > 0) {
            int i = 0;
            for(; sequence[i] < sequence[seqLength - 1]; i++){
            }
            for(;sequence[i] > sequence[seqLength - 1]; i++){
            }
            if (i != seqLength - 1) {
                return false;
            }
            seqLength --;
        }

        return true;
    }
}
