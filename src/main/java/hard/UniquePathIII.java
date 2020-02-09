package hard;


import java.util.stream.IntStream;
import helpFunctions.HelpFunction;

public class UniquePathIII {
    public boolean zeroInMatrix(int [][] grid){
        boolean result = false;
        for (int i = 0; i < grid.length; i++) {
            result = IntStream.of(grid[i]).anyMatch(x -> x == 0);
            if (result){
                return result;
            }
        }
        return result;
    }
    public int findPaths(int [][] matrix, int row, int col, int rowMax, int colMax){
        HelpFunction helpFunction = new HelpFunction();
        int [][]grid = helpFunction.copy2DArray(matrix);
        if (row < 0 || col < 0 || row >= rowMax || col >= colMax)
            return 0;
        if (grid[row][col] == -1 || grid[row][col] == 1)
            return 0;
        if (grid[row][col] == 2 && !(zeroInMatrix(grid)))
            return 1;
        if (grid[row][col] == 2)
            return 0;

        grid[row][col] = 1;

        return (findPaths(grid, row - 1, col, rowMax, colMax) +
                findPaths(grid, row + 1, col, rowMax, colMax) +
                findPaths(grid, row, col - 1, rowMax, colMax) +
                findPaths(grid, row, col + 1, rowMax, colMax));
    }

    public int uniquePathIII(int[][] grid){
        int rowMax = grid.length;
        int colMax = grid[0].length;
        int row = 0;
        int col = 0;
        outerloop:
        for (row = 0; row < rowMax; row++) {
            for (col = 0; col < colMax; col++) {
                if (grid[row][col] == 1){
                    break outerloop;
                }
            }
        }
        return (findPaths(grid, row - 1, col, rowMax, colMax) +
                findPaths(grid, row + 1, col, rowMax, colMax) +
                findPaths(grid, row, col - 1, rowMax, colMax) +
                findPaths(grid, row, col + 1, rowMax, colMax));
    }
}
