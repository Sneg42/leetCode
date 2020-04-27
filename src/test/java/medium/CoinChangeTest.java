package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChangeTest {
    @Test
    public void testCoinChange(){
        CoinChange test = new CoinChange();
        System.out.println(test.coinChange(new int[]{1,3,5}, 11));

        System.out.println(test.coinChange(new int[]{2}, 3));
    }
}