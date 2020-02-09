package medium;

import org.junit.Test;

public class AngleBetweenHandsOfAClockTest {

    @Test
    public void angleClockTest(){
        AngleBetweenHandsOfAClock test = new AngleBetweenHandsOfAClock();
        System.out.println("8:15 - " + test.angleClock(8, 15));

        System.out.println("12:30 - " + test.angleClock(12, 30));

        System.out.println("3:30 - " + test.angleClock(3, 30));

        System.out.println("3:15 - " + test.angleClock(3, 15));

        System.out.println("12:00 - " + test.angleClock(12, 0));
    }
}
