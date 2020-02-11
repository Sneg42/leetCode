package medium;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {

    private boolean dfs(int cur, List<List<Integer>> graph, boolean[] visited, boolean[] completed, int numCourses){
        if (visited[cur])
            return false;
        visited[cur] = true;

        for (int i : graph.get(cur)) {
            if (!completed[i]){
                boolean res = dfs(i, graph, visited, completed, numCourses);
                if (!res)
                    return false;
            }
        }
        visited[cur] = false;
        completed[cur] = true;

        return true;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites){
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] each : prerequisites) {
            graph.get(each[0]).add(each[1]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] completed = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!completed[i]){
                boolean res = dfs(i, graph, visited, completed, numCourses);
                if (!res)
                    return false;
            }
        }
        return true;
    }
}
