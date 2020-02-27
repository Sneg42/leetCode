package medium;



public class MinimumPathSum {

    // recursive
    private int move(int[][] grid, int row, int col , int[][] DP){
        if (row == grid.length - 1 && col == grid[0].length - 1)
            return grid[row][col];
        int res = grid[row][col];
        int moveRow = 0;
        int moveCol = 0;
        if (row != grid.length-1)
            moveRow = move(grid,  row + 1,  col , DP);
        if (col != grid[0].length-1)
            moveCol = move(grid,  row,  col + 1, DP);
        if (row == grid.length-1)
            return  res + moveCol;
        if (col == grid[0].length-1)
            return res + moveRow;
        return Math.min(res + moveRow, res + moveCol);
    }

    // DP
    public int minPathSum(int[][] grid){
        int[][] DP = new int[grid.length][grid[0].length];
        for (int row = grid.length - 1; row >= 0 ; row--) {
            for (int col = grid[0].length - 1; col >= 0 ; col--) {
                if (row == grid.length - 1 && col == grid[0].length - 1) {
                    DP[row][col] = grid[row][col];
                }
                else if (row ==grid.length - 1) {
                    DP[row][col] = DP[row][col + 1] + grid[row][col];
                }
                else if (col == grid[0].length - 1) {
                    DP[row][col] = DP[row+1][col] + grid[row][col];
                }
                else{
                    int moveRow = DP[row+1][col] + grid[row][col];
                    int moveCol = DP[row][col + 1] + grid[row][col];
                    DP[row][col] = Math.min(moveRow, moveCol);
                }
            }
        }
        return DP[0][0];
    }
}
