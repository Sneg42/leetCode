package medium;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n){
        int[] map = new int[26];
        int time = 0;
        
        for (char c: tasks){
            map[c - 'A']++;
        }
        Arrays.sort(map);
        while (map[25] > 0){
            for (int i = 0; i < n; i++) {
                if (map[25] == 0)
                    break;
                if (i < 26 && map[25 - i] > 0)
                    map[25 - i]--;
                time++;
            }
            Arrays.sort(map);
        }
        return time;
    }
}
