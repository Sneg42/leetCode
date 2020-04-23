package medium;

import medium.BestTineToBuyAndSellStockWithCooldown;
import org.junit.Test;

public class BestTineToBuyAndSellStockWithCooldownTest {

    @Test
    public void testMaxProfit(){
        BestTineToBuyAndSellStockWithCooldown test = new BestTineToBuyAndSellStockWithCooldown();
        System.out.println(test.maxProfit(new int[]{1, 2, 3, 0, 2}));
        System.out.println(test.maxProfit(new int[]{1, 2, 3, 0, 2, 4}));
        System.out.println(test.maxProfit(new int[]{1, 2, 3, 0, 2, 4, 3, 7}));
    }
}
