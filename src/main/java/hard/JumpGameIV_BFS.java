package hard;

import java.util.*;

public class JumpGameIV_BFS {

    public int minJumps(int[] arr) {
        int dp = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        boolean[] visited = new boolean[arr.length];
        visited[0] = true;
        int n = arr.length;
        if (n == 1)
            return 0;

        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])==false){
                map.put(arr[i], new HashSet<>());
            }
            map.get(arr[i]).add(i);
        }
        int i;
        while (!queue.isEmpty()) {
            int size = queue.size();
            dp++;
            while (size-- > 0){
                i = queue.poll();
                if (i < n - 1 && !visited[i + 1]) {
                    visited[i + 1] = true;
                    if (i + 1 == n - 1)
                        return dp;
                    queue.add(i + 1);
                }
                if (i != 0 && !visited[i - 1]) {
                    visited[i - 1] = true;
                    queue.add(i - 1);
                }
                for(int next : map.get(arr[i])) {
                    if(next != i && !visited[next]) {
                        visited[next] = true;
                        if (next == n -1)
                            return dp;
                        queue.add(next);
                    }
                }
            }
        }
        return dp;
    }
//    private void setValue(int i, List<Integer> dp) {
//        for (int j = i; j > 1; j--) {
//            if (dp.get(j - 1) > dp.get(j)) {
//                dp.set(j - 1, dp.get(j) + 1);
//            } else
//                break;
//        }
//        for (int j = i; j < dp.size() - 1; j++) {
//            if (dp.get(j + 1) > dp.get(j)) {
//                dp.set(j + 1, dp.get(j) + 1);
//            } else
//                break;
//        }
//    }
//
//    private void jump(int[] arr, Queue<Integer> queue, List<Integer> dp, Queue<Integer> prevQueue) {
//
//        boolean[] visited = new boolean[arr.length];
//        int prev;
//
//        visited[0] = true;
//        int n = arr.length;
//
////        Map<Integer, List<Integer>> map = new HashMap<>();
////        for(int j = 0; j < n; j++) {
////            map.computeIfAbsent(arr[j], x -> new ArrayList<>()).add(0, j);
////        }
//        Map<Integer, Set<Integer>> map = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            if(map.containsKey(arr[i])==false){
//                map.put(arr[i], new HashSet<>());
//            }
//            map.get(arr[i]).add(i);
//        }
//        int i;
//        int lvl = 0;
//        while (!queue.isEmpty()) {
//                lvl ++;
//                int size = queue.size();
//                while (size-- > 0){
//                    i = queue.poll();
//                    prev = prevQueue.poll();
//
//                    if (i == arr.length) {
//                        return;
//                    }
//                    if (i != 0)
//                        dp.set(i, prev);
//
//                    if (i < arr.length - 1 && !visited[i + 1]) {
//                        visited[i + 1] = true;
//                        if (i + 1 == n - 1){
//                            dp.set(i+1, dp.get(i) + 1);
//                            return;
//                        }
//                        queue.add(i + 1);
//                        prevQueue.add(prev + 1);
//
//                    }
//                    if (i != 0 && !visited[i - 1]) {
//                        visited[i - 1] = true;
//                        queue.add(i - 1);
//                        prevQueue.add(prev + 1);
//                    }
//    //                int j = i;
//    //                while (++j < arr.length) {
//    //                    if (arr[i] == arr[j] && !visited[j]) {
//    //                        visited[j] = true;
//    //                        queue.add(j);
//    //                        prevQueue.add(prev + 1);
//    //                    }
//    //                }
//                    for(int next : map.get(arr[i])) {
//                        if(next != i && !visited[next]) {
//                            visited[next] = true;
//                            if (next == n - 1){
//                                dp.set(next, dp.get(i) + 1);
//                                return;
//                            }
//                            queue.add(next);
//                            prevQueue.add(prev + 1);
//                        }
//                    }
//            }
//        }
//        }

//    public int minJumps(int[] arr) {
//        System.out.println(Arrays.toString(arr));
//        List<Integer> dp = new ArrayList<>(arr.length);
//        Queue<Integer> queue = new LinkedList<>();
//        Queue<Integer> prevQueue = new LinkedList<>();
//        queue.add(0);
//        prevQueue.add(0);
//
//        for (int i = 0; i < arr.length; i++) {
//            dp.add(i, i);
//        }
//        jump(arr, queue, dp, prevQueue);
//        if (dp.size() == 0)
//            return 0;
//        System.out.println(dp.toString());
//        return dp.get(dp.size() - 1);
//    }

//    public int minJumps(int[] arr) {
//        int n = arr.length;
//        if(n == 1) {
//            return 0;
//        }
//        Queue<Integer> q = new LinkedList<>();
//        Map<Integer, List<Integer>> map = new HashMap<>();
//        for(int i = 0; i < n; i++) {
//            map.computeIfAbsent(arr[i], x -> new ArrayList<>()).add(0,i);
//        }
//        int level = 0;
//        q.offer(0);
//        boolean visited[] = new boolean[n];
//        visited[0] = true;
//        while(!q.isEmpty()) {
//            int size = q.size();
//            level ++;
//            while(size-- > 0) {
//                int curr = q.poll();
//                if(curr > 0 && !visited[curr-1]) {
//                    visited[curr-1] = true;
//                    q.offer(curr-1);
//                } if(curr < n-1 && !visited[curr+1]) {
//                    visited[curr+1] = true;
//                    if(curr + 1 == n-1) {
//                        return level;
//                    }
//                    q.offer(curr+1);
//                }
//                for(int next : map.get(arr[curr])) {
//                    if(next != curr && !visited[next]) {
//                        visited[next] = true;
//                        if(next == n-1) {
//                            return level;
//                        }
//                        q.offer(next);
//                    }
//                }
//            }
//        }
//        return -1;
    }
