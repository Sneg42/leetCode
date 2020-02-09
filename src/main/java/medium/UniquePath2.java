package medium;

import java.util.Arrays;

public class UniquePath2 {

    public int uniquePathsWithObstacle(int[][] obstacleGrid){
        for (int row = 0; row < obstacleGrid.length; row++) {
            if (obstacleGrid[row][0] == 1) {
                obstacleGrid[row][0] = -1;
                break;
            }
            obstacleGrid[row][0] = 1;
        }
        for (int col = 1; col < obstacleGrid[0].length; col++) {
            if (obstacleGrid[0][col] == 1){
                obstacleGrid[0][col] = -1;
                break;
            }
            obstacleGrid[0][col] = 1;
        }
        for (int row = 1; row < obstacleGrid.length; row++) {
            for (int col = 1; col < obstacleGrid[0].length; col++) {
                if (obstacleGrid[row][col] == 1) {
                    obstacleGrid[row][col] = -1;
                }
                else{
                    if (obstacleGrid[row - 1][col] == -1 && obstacleGrid[row][col - 1] == -1)
                        obstacleGrid[row][col] = 0;
                    else if (obstacleGrid[row - 1][col] == -1 )
                        obstacleGrid[row][col] = obstacleGrid[row][col - 1];
                    else if(obstacleGrid[row][col - 1] == -1)
                        obstacleGrid[row][col] = obstacleGrid[row - 1][col];
                    else
                        obstacleGrid[row][col] = obstacleGrid[row - 1][col] + obstacleGrid[row][col - 1];
                }
                }
            }
        return obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
