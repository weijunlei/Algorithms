package lc_329_longestIncreasingPath;

class Solution {
    private int[][] paths = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private int[][] dps;
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0){
            return 0;
        }
        dps = new int[matrix.length][matrix[0].length];
        int result = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                result = Math.max(dfs(matrix, i, j), result);
            }
        }
        return result;
    }

    private int dfs(int[][] matrix, int i, int j){
        if(dps[i][j] != 0){
            return dps[i][j];
        }
        for(int[] path: paths){
            int x = i + path[0];
            int y = j + path[1];
            if(x >= 0 && x < matrix.length && y >=0 && y < matrix[0].length && matrix[i][j] < matrix[x][y]){
                dps[i][j] = Math.max(dps[i][j], dfs(matrix, x, y));
            }
        }
        return ++dps[i][j];
    }
}
