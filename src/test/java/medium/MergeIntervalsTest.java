package medium;

import org.junit.Test;

import java.util.Arrays;

public class MergeIntervalsTest {

    @Test
    public void mergeIntervals(){
        MergeIntervals test = new MergeIntervals();

        int [][] arr = {{1,3}};
        System.out.println(Arrays.deepToString(test.merge(arr)));

        arr = new int[][]{{1,3}, {2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(test.merge(arr)));

        arr = new int[][]{};
        System.out.println(Arrays.deepToString(test.merge(arr)));

        arr = new int[][]{{1,4},{4,5}};
        System.out.println(Arrays.deepToString(test.merge(arr)));
    }
}
