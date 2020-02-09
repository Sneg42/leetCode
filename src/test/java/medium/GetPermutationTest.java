package medium;

import medium.GetPermutation;
import org.junit.Test;

public class GetPermutationTest {
    @Test
    public void getPermutationTest(){

        GetPermutation test = new GetPermutation();
        System.out.println(test.getPermutation(4, 9));

        System.out.println(test.getPermutation(4, 3));

        System.out.println(test.getPermutation(3, 3));

        System.out.println(test.getPermutation(5, 5));
    }
}
