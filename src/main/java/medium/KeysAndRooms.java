package medium;

import java.util.List;

public class KeysAndRooms {
    private int sum = 0;

    private void visitRoom(List<List<Integer>> rooms, int room, boolean []visited){
        if (visited[room])
            return ;
        visited[room] = true;
        sum -= room;
        for (int i = 0; i < rooms.get(room).size(); i++)
            visitRoom(rooms, rooms.get(room).get(i), visited);
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms){
        int length = rooms.size();
        boolean []visited = new boolean[length];
        
        for (int i = 1; i < length; i++)
            sum += i;
        visitRoom(rooms, 0, visited);
        System.out.println(sum);
        return sum == 0;
    }
}
