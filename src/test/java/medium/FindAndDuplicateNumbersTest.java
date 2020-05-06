package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindAndDuplicateNumbersTest {
    @Test
    public void testFindDuplicate(){
        FindAndDuplicateNumbers test = new FindAndDuplicateNumbers();

        int [] arr = {1,3,4,2,2};
        System.out.println(test.findDuplicate(arr));
    }
}