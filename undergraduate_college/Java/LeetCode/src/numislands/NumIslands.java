package numislands;

/**
 * @author : Qingfeng
 * @date : 2018/8/18
 */
public class NumIslands {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }

        int result = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '1'){
                    searchPoint(grid, i, j);
                    result += 1;
                }
            }
        }

        return result;
    }

    private void searchPoint(char[][] grid, int i, int j){
        if (i >= grid.length || i < 0 || j >= grid[0].length || j < 0 || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        searchPoint(grid, i + 1, j);
        searchPoint(grid, i, j+1);
        searchPoint(grid, i - 1, j);
        searchPoint(grid, i, j - 1);
    }
}
