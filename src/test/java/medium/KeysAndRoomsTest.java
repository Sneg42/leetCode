package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class KeysAndRoomsTest {
    @Test
    public void keysAndRoomsTest(){
        KeysAndRooms test = new KeysAndRooms();


        List<List<Integer>> rooms = new ArrayList<List<Integer>>();
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        rooms.add(arr);

        arr = new ArrayList<>();
        arr.add(3);
        arr.add(0);
        arr.add(1);
        rooms.add(arr);

        arr = new ArrayList<>();
        arr.add(2);
        rooms.add(arr);

        arr = new ArrayList<>();
        arr.add(0);
        rooms.add(arr);


        System.out.println(test.canVisitAllRooms(rooms));

    }
}
