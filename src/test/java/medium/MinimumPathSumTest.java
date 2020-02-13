package medium;


import org.junit.Test;

public class MinimumPathSumTest {

    @Test
    public void minPathTest(){
        MinimumPathSum test = new MinimumPathSum();

        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1}};
        System.out.println(test.minPathSum(grid));
    }


}
