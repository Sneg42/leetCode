package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> listSubset = new ArrayList<>();
        List<Integer> curList = new ArrayList<>();
        listSubset.add(curList);
        if (nums.length <= 0 )
            return listSubset;
        for (int i = 0; i < nums.length; i++) {
            int size = listSubset.size();
            for (int j = 0; j < size; j++) {
                curList = new ArrayList<>(listSubset.get(j));
                curList.add(nums[i]);
                listSubset.add(curList);
            }
        }
        return listSubset;
    }

}
