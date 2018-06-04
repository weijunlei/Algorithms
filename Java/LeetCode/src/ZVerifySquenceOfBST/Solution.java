package ZVerifySquenceOfBST;

public class Solution {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        int seqLength = sequence.length;
        while (--seqLength > 0)
        {
            int i = 0;
            while (sequence[i++] < sequence[seqLength]);
            while (i < seqLength && sequence[i++] > sequence[seqLength]);
            if (i < seqLength) return false;
        }
        return true;
    }
}
