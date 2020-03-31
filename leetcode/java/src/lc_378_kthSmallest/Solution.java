package lc_378_kthSmallest;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            throw new RuntimeException("matrix is empty!");
        }
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        if (k > colSize * rowSize){
            throw new RuntimeException("matrix is less than k!");
        }

        int left = matrix[0][0];
        int right = matrix[matrix.length - 1][matrix[0].length - 1];
        int count = -1;

        while (left < right){
            int mid = (left + right) / 2;
            count = getCount(matrix, mid, rowSize, colSize);
            if (count < k){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return right;
    }

    private int getCount(int[][] matrix,int mid,int rowSize,int colSize){
        int rowIndex = rowSize - 1;
        int colIndex = 0;
        int count = 0;

        while (rowIndex >= 0 && colIndex < colSize){
            if (matrix[rowIndex][colIndex] <= mid){
                count += rowIndex + 1;
                colIndex ++;
            }else{
                rowIndex --;
            }
        }
        return count;
    }
}
