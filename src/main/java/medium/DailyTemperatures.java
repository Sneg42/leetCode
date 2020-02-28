package medium;

import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] T){
        if (T.length == 0)
            return new int[0];
        Stack<Integer[]> stack = new Stack<>();
        int[] waitingDays = new int[T.length];
        stack.push(new Integer[]{0, T[0]});
        for (int i = 1; i < T.length; i++) {
            int temp = T[i];
            while (!stack.isEmpty() && temp > stack.peek()[1]){
                int index = stack.pop()[0];
                waitingDays[index] = i - index;
            }
            stack.push(new Integer[]{i, temp});
        }
        return waitingDays;
    }
}
