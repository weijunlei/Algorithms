package searchmatrixversiontwo;

/**
 * @author : Qingfeng
 * @date : 2018/8/29
 * 搜索二维矩阵
 */
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }

        int rowLength = matrix.length;
        int rowIndex = 0;
        int colLength = matrix[0].length;
        int colIndex = colLength - 1;

        while (rowIndex < rowLength && colIndex >= 0){
            while (matrix[rowIndex][colIndex] < target){
                rowIndex ++;
                if (rowIndex == rowLength){
                    return false;
                }
            }

            while (matrix[rowIndex][colIndex] > target){
                colIndex --;
                if (colIndex < 0){
                    return false;
                }
            }

            if (matrix[rowIndex][colIndex] == target){
                return true;
            }
        }

        return false;
    }
}
