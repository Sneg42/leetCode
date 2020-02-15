package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsTest {
    @Test
    public void subsetsTest(){
        Subsets test = new Subsets();
        List<List<Integer>> list = test.subsets(new int[]{1,2,3});
        System.out.println(Arrays.deepToString(list.toArray()));

        list = test.subsets(new int[]{});
        System.out.println(Arrays.deepToString(list.toArray()));
    }


}
