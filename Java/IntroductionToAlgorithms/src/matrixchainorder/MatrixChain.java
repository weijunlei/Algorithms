package matrixchainorder;

/**
 * @author : Qingfeng
 * @date : 2018/6/27
 * 矩阵链乘法
 */
public class MatrixChain {
    public void matrixChain(int p[], int[][] m, int[][] s){
        if (p == null || p.length == 0){
            return;
        }

        for(int i = 0; i < p.length; i++){
            m[i][i] = 0;
        }

        for(int l = 2; l < p.length; l++){
            for(int i = 1; i < p.length - l + 1; i++){
                int j = i + l - 1;
                m[i][j] = Integer.MAX_VALUE;
                for(int k = i; k < j; k++){
                    int tempCount = m[i][k] + m[k + 1][j] + p[i - 1]* p[k] * p[j];
                    if (tempCount < m[i][j]){
                        m[i][j] = tempCount;
                        s[i][j] = k;
                    }
                }
            }
        }
    }
}
