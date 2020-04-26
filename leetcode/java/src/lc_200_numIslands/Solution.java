package lc_200_numIslands;

class Solution {
    private int[][] paths = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0){
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if (grid[i][j] == '1'){
                    result += 1;
                }
                dfs(grid, i, j);
            }
        }
        return result;
    }

    private void dfs(char[][] grid, int i, int j){
        if(grid[i][j] == '0'){
            return;
        }
        int m = grid.length;
        int n = grid[0].length;
        grid[i][j] = '0';
        for(int[] path: paths){
            int x = i + path[0];
            int y = j + path[1];
            if (x >= 0 && x < m && y >= 0 && y < n){
                if (grid[x][y] == '1'){
                    dfs(grid, x, y);
                }
            }
        }
    }
}
