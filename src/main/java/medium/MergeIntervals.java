package medium;

import java.util.Arrays;

public class MergeIntervals {

    public int[][] merge(int[][] intervals){
        if (intervals == null || intervals.length <= 1){
            return intervals;
        }
        int[][] res = new int[intervals.length][2];
        int count = 0;
        Arrays.sort(intervals, (int[]a, int[]b) -> a[0] - b[0]);
        res[count++] = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > res[count-1][1]){
                res[count++] = intervals[i];
            }
            else{
                int right = Math.max(res[count-1][1], intervals[i][1]);
                res[count - 1][1] = right;
            }
        }
        return Arrays.copyOfRange(res, 0, count);
    }
}
