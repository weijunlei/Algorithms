package lc_240_search_matrix2;

public class Solution1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int rowIndex = 0;
        int colIndex = columns - 1;
        boolean result = false;

        while (rowIndex < rows && colIndex >= 0) {
            if (matrix[rowIndex][colIndex] > target) {
                colIndex --;
            }
            else if ( matrix[rowIndex][colIndex] < target) {
                rowIndex ++;
            }
            else if (target == matrix[rowIndex][colIndex]) {
                result = true;
                break;
            }
        }
        return result;
    }
}
