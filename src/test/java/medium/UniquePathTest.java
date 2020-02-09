package medium;

import medium.UniquePath;
import org.junit.Test;
import sun.awt.UNIXToolkit;

public class UniquePathTest {
    @Test
    public void uniquePathTest(){
        UniquePath test = new UniquePath();
        System.out.println(test.uniquePaths(3, 2));

        System.out.println(test.uniquePaths(1, 1));

        System.out.println(test.uniquePaths(2, 1));

        System.out.println(test.uniquePaths(1, 2));

        System.out.println(test.uniquePaths(7, 3));

        System.out.println(test.uniquePaths(6, 2));
        System.out.println(test.uniquePaths(51, 9));

    }
}
