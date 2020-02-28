package medium;


import org.junit.Test;

import java.util.Arrays;

public class DailyTemperaturesTest {
    @Test
    public void dailyTemperaturesTest(){
        DailyTemperatures test = new DailyTemperatures();
        int[] temps = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(test.dailyTemperatures(temps)));

        temps = new int[]{76, 75, 74, 73, 72};
        System.out.println(Arrays.toString(test.dailyTemperatures(temps)));

        temps = new int[]{};
        System.out.println(Arrays.toString(test.dailyTemperatures(temps)));

        temps = new int[]{75};
        System.out.println(Arrays.toString(test.dailyTemperatures(temps)));

        temps = new int[]{73, 74, 75, 76, 77, 78, 79};
        System.out.println(Arrays.toString(test.dailyTemperatures(temps)));
    }


}
