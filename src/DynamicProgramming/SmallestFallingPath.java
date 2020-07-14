package DynamicProgramming;

public class SmallestFallingPath {
    private static int path(int[][] A){
        int n = A.length;
        int m = A[0].length;
        int[][] dp = new int[n][m];
        for(int i=0;i<m;i++){
            dp[n-1][i] = A[n-1][i];
        }
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<m;j++){
                if(j ==0)
                    dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1])+ A[i][j];
                else if(j < m-1)
                    dp[i][j] = Math.min(Math.min(dp[i+1][j-1], dp[i+1][j]), dp[i+1][j+1])+ A[i][j];
                else
                    dp[i][j] = Math.min(dp[i+1][j-1], dp[i+1][j]) + A[i][j];
            }
        }
        int min = dp[0][0];
        for(int i=1;i<m;i++){
            min = Math.min(dp[0][i], min);
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] v = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(path(v));
    }
}
