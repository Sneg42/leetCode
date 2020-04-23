package medium;

public class UniqueBinarySearchTrees {
    public int numTrees(int n){
        if (n < 1)
            return 0;
        int [][] dp = new int[n+1][n+1];
        return dp(1, n, dp);
    }
    private int dp(int i, int j, int[][]dp){
        if (i >= j)
            return 1;
        if (dp[i][j] != 0)
            return dp[i][j];
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += dp(i, k-1, dp) * dp(k+1, j, dp);
        }
        dp[i][j] = sum;
        return dp[i][j];
    }

}
