package medium;

import medium.UniquePath2;
import org.junit.Test;

public class UniquePath2Test {

    @Test
    public void uniquePaths2Test(){
        int [][]matrix = {
                {0, 0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0}};
        UniquePath2 test = new UniquePath2();
        System.out.println(test.uniquePathsWithObstacle(matrix));
    }
}
