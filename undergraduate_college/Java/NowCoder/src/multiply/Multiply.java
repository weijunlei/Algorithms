package multiply;

/**
 * @author : Qingfeng
 * @date : 2018/6/28
 */
public class Multiply {
    public int[] multiply(int[] A){
        if (A == null || A.length == 0){
            return (int[]) null;
        }

        int[] B = new int[A.length];
        int result = 1;
        for(int i = 0; i < A.length; i++){
            B[i] = result;
            result *= A[i];
        }
        result = 1;
        for(int i = A.length - 1; i >= 0; i--){
            B[i] *= result;
            result *= A[i];
        }

        return B;
    }
}
