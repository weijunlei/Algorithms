package lc_240_search_matrix2;

public class Solution {
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
            while (rowIndex < rows && colIndex >= 0 && matrix[rowIndex][colIndex] > target) {
                colIndex --;
            }
            while (rowIndex < rows && colIndex >= 0 && matrix[rowIndex][colIndex] < target) {
                rowIndex ++;
            }
            if (rowIndex < rows && colIndex >= 0 && target == matrix[rowIndex][colIndex]) {
                result = true;
                break;
            }
        }
        return result;
    }
}
