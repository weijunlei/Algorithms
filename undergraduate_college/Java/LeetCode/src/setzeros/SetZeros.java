package setzeros;

/**
 * @author : Qingfeng
 * @date : 2018/6/25
 */
public class SetZeros {
    public void setZeros(int[][] matrix){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return;
        }

        boolean[] isRowsZeros = new boolean[matrix.length];
        boolean[] isColZeros = new boolean[matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    isRowsZeros[i] = true;
                    isColZeros[j] = true;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            if(isRowsZeros[i]){
                for (int j = 0; j < matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j = 0; j < matrix[0].length; j++){
            if(isColZeros[j]){
                for(int i = 0; i < matrix.length; i++){
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
