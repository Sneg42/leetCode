package easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxSubArray {

    public int sum_arr(int[] nums){
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++)
            sum += nums[i];

        return sum;
    }
    public int maxSubArrayRecur(int[] nums){
        int res = Integer.MIN_VALUE;
        int sum = 0;
        if (nums.length > 1)
            res = maxSubArrayRecur(Arrays.copyOfRange(nums, 0, nums.length - 1));
        for (int i = 0; i < nums.length; i++) {
            sum = sum_arr(Arrays.copyOfRange(nums, i, nums.length));
            if (res < sum)
                res = sum;
        }
        return res;
    }

    public int maxSubArray(int[] nums){
        int []dp = new int[nums.length];
        int maxSum = dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i-1] + nums[i]);
            maxSum = Math.max(dp[i], maxSum);
        }
        return maxSum;
    }
}
