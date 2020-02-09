package medium;

public class UniquePath {
    public int uniquePaths(int m, int n){
        int [][]matrix = new int[m][n];
        int i;
        for ( i = 0; i < m; i++) {
            matrix[i][0] = 1;
        }
        for (i = 0; i < n; i++) {
            matrix[0][i] = 1;
        }
        for (int row = 1; row < m; row++) {
            for ( i = 1; i < n; i++) {
                matrix[row][i] = matrix[row-1][i] + matrix[row][i-1];
            }
        }
        return matrix[m-1][n-1];
//        if (m == 1 && n == 1){
//            return (1);
//        }
//        else if (m == 1)
//            return (uniquePaths(m, n -1));
//        else if (n == 1)
//            return (uniquePaths(m - 1, n));
//        return (uniquePaths(m -1, n) + uniquePaths( m, n -1));
    }
}
