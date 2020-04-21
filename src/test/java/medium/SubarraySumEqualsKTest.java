package medium;


import org.junit.Test;

public class SubarraySumEqualsKTest {

    @Test
    public void subarrayTest(){
        SubarraySumEqualsK test = new SubarraySumEqualsK();
        int [] arr = {1, 1, 1};
        System.out.println(test.subarraySum(arr, 2));

        test = new SubarraySumEqualsK();
        arr = new int[]{1, 1, 1, 1};
        System.out.println(test.subarraySum(arr, 2));

        test = new SubarraySumEqualsK();
        arr = new int[]{0};
        System.out.println(test.subarraySum(arr, 2));

        test = new SubarraySumEqualsK();
        arr = new int[]{1};
        System.out.println(test.subarraySum(arr, 1));

        test = new SubarraySumEqualsK();
        arr = new int[]{1,2};
        System.out.println(test.subarraySum(arr, 3));

        test = new SubarraySumEqualsK();
        arr = new int[]{1,2};
        System.out.println(test.subarraySum(arr, 1));

        test = new SubarraySumEqualsK();
        arr = new int[]{-1,-1, 1};
        System.out.println(test.subarraySum(arr, 0));

        test = new SubarraySumEqualsK();
        arr = new int[]{1,2, 3};
        System.out.println(test.subarraySum(arr, 3));

        test = new SubarraySumEqualsK();
        arr = new int[]{28,54,7,-70,22,65,-6};
        System.out.println(test.subarraySum(arr, 100));
    }

}
