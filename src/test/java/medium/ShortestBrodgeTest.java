package medium;

import helpFunctions.HelpFunction;
import org.junit.Test;

public class ShortestBrodgeTest {
    @Test
    public void shortestBridgeTest(){
        ShortestBridge test = new ShortestBridge();
        HelpFunction help = new HelpFunction();

        int[][] A = {{0,1}, {1,0}};
        help.print2DArr(A);
        System.out.println(test.shortestBridge(A));

        A = new int[][]{{0,1, 0}, {0, 0, 0}, {0, 0, 1}};
        help.print2DArr(A);
        System.out.println(test.shortestBridge(A));

        A = new int[][]{{1}, {0}, {1}};
        help.print2DArr(A);
        System.out.println(test.shortestBridge(A));

        A = new int[][]{{1, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 0, 0, 1}, {1, 1, 1, 1, 1}};
        help.print2DArr(A);
        System.out.println(test.shortestBridge(A));

        A = new int[][]{{0, 1, 1, 1, 1}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {1, 1, 1, 1, 1}};
        help.print2DArr(A);
        System.out.println(test.shortestBridge(A));
    }
}
