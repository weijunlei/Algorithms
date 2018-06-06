package printmatrix;

import java.util.ArrayList;

/**
 * Author: FengQing
 * Email: qingfengwuyu233@gmail.com
 * Creation: 6/6/2018 3:16 PM
 **/

public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int rowMaxIndex = matrix.length - 1;
        int colMaxIndex = matrix[0].length - 1;
        int rowMinIndex = 0;
        int colMinIndex = 0;

        while(rowMaxIndex >= rowMinIndex && colMaxIndex >= colMinIndex) {
            for (int i = colMinIndex; i <= colMaxIndex; i++) {
                result.add(matrix[rowMinIndex][i]);
            }
            for (int i = colMinIndex + 1; i <= rowMaxIndex; i++) {
                result.add(matrix[i][colMaxIndex]);
            }
            if (rowMaxIndex > rowMinIndex) {
                for (int i = colMaxIndex - 1; i >= colMinIndex ; i--) {
                    result.add(matrix[rowMaxIndex][i]);
                }
            }
            if (colMaxIndex > colMinIndex) {
                for(int i = rowMaxIndex - 1; i > rowMinIndex; i--) {
                    result.add(matrix[i][colMinIndex]);
                }
            }

            rowMaxIndex --;
            rowMinIndex ++;
            colMaxIndex --;
            colMinIndex ++;
        }
        return result;
    }
}
