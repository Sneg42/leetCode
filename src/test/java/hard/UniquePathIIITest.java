package hard;

import hard.UniquePathIII;
import org.junit.Test;

public class UniquePathIIITest {
    @Test
    public void uniquePathIII(){
        UniquePathIII test = new UniquePathIII();
        int [][]arr = {{1, 0, 0, 0},
                         {0, 0, 0, 0},
                         {0, 0, 2, -1}};
        System.out.println(test.uniquePathIII(arr));

        int [][]arr2 = {{1, 0, 0, 0},
                         {0, 0, 0, 0},
                        {0, 0, 0, 2}};
        System.out.println(test.uniquePathIII(arr2));

        int [][]arr3 = {{0, 1},
                        {2, 0}};
        System.out.println(test.uniquePathIII(arr3));

        int [][]arr4 = {{1, -1},
                        {0, -1},
                        {0, -1},
                        {-1, 2}};
        System.out.println(test.uniquePathIII(arr4));
    }
}
