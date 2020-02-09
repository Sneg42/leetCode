package medium;

public class AngleBetweenHandsOfAClock {

    public double angleClock(int hour, int minutes){
        double angle = 0;
        double gradMin = minutes * 6; // 6 because (360' total / 60 minutes) = 6 degree per minute;
        // 30 because (360 total / 12 hours) = 30 degree per hour
        // and calculate min / 60 - how much hour hand move more
        double granHour = hour * 30 + ((minutes / 60) == 1 ? 0 : (minutes / 60.00)) * 30;

        angle = Math.abs(granHour - gradMin);
        return Math.min(360 - angle, angle);
    }
}
