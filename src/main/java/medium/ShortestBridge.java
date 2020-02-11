package medium;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestBridge {

    private int[] findIsland(int[][] A){
        int[]row_col = new int[2];
        outloop:
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[0].length; col++) {
                if (A[row][col] == 1) {
                    row_col[0] = row;
                    row_col[1] = col;
                    break outloop;
                }
            }
        }
        return row_col;
    }

    private void addIslandInQueue(int[][] A, int row, int col, Queue<int[]>queue, boolean[][] visited){
        if (row < 0 || row >= A.length || col < 0 || col >= A[0].length || A[row][col] == 0)
            return ;
        if (visited[row][col] == true)
            return;
        queue.add(new int[]{row, col});
        visited[row][col] = true;
        addIslandInQueue(A, row - 1, col, queue, visited);
        addIslandInQueue(A, row + 1, col, queue, visited);
        addIslandInQueue(A, row, col - 1, queue, visited);
        addIslandInQueue(A, row, col + 1, queue, visited);
    }

    private int findShortestBridge(int[][] A, Queue<int[]>queue, boolean[][] visitedOldIsland){
        int path = 0, rows = A.length, cols = A[0].length;
        boolean [][] vis = new boolean[rows][cols];

        while (!queue.isEmpty()){
            int size = queue.size();
            path++;
            while (size-- > 0) {
                int[] cur = queue.remove();
                int row = cur[0];
                int col = cur[1];
                if (vis[row][col] == true)
                    continue;
                if (A[row][col] == 1 && !visitedOldIsland[row][col])
                    return path - 2;
                vis[row][col] = true;
                if (row - 1 >= 0)
                    queue.add(new int[]{row-1, col});
                if (row + 1 < rows)
                    queue.add(new int[]{row+1, col});
                if (col - 1 >= 0)
                    queue.add(new int[]{row, col-1});
                if (col + 1 < cols)
                    queue.add(new int[]{row, col+1});
            }
        }
        return path;
    }

    public int shortestBridge(int [][] A){
        int row_col[];
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[A.length][A[0].length];
        row_col = findIsland(A);
        addIslandInQueue( A, row_col[0], row_col[1], queue, visited);

        return findShortestBridge(A, queue, visited);
    }
}
