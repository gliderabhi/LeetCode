package DynamicProgramming;

public class CherryPickup {
    public static int cherryPickup(int[][] grid) {
        int n  = grid.length;
        int m = grid[0].length;
        int [][] dp = new int[n+1][m+1];
        dp[n-1][m-1] = grid[n-1][m-1];
        for(int i= n-1;i>=0;i--){
            if(grid[i][m-1] !=-1)
                dp[i][m-1] = dp[i+1][m-1]+ grid[i][m-1];
            else
                break;

        }
        for(int i= m-1;i>=0;i--){
            if(grid[n-1][i] !=-1)
                dp[n-1][i] = dp[n-1][i+1]+ grid[n-1][i];
            else
                break;
        }
        for(int i=n-2;i>=0;i--)
            for(int j =m-2;j>=0;j--)
                dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1])+ grid[i][j];

         int r =0, c=0;
         while(r!=n && c!=m){
             grid[r][c] = 0;
             if(dp[r+1][c] > dp[r][c+1]) {
                 grid[r + 1][c] = 0;
                 r = r+1;
             }
             if(dp[r+1][c] < dp[r][c+1]) {
                 grid[r][c + 1] = 0;
                 c = c+1;
             }

         }
         //do the bottom up again

        for(int i= n-1;i>=0;i--){
            if(grid[i][m-1] !=-1)
                dp[i][m-1] = dp[i+1][m-1]+ grid[i][m-1];
            else
                break;

        }
        for(int i= m-1;i>=0;i--){
            if(grid[n-1][i] !=-1)
                dp[n-1][i] = dp[n-1][i+1]+ grid[n-1][i];
            else
                break;
        }
        for(int i=n-2;i>=0;i--)
            for(int j =m-2;j>=0;j--)
                dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1])+ grid[i][j];


        return  dp[0][0];
    }

    public static void main(String[] args) {
        int[][] m = {
                {0 , 1 ,-1},
                {1,0,-1},
                {1,1,1}
        };
        System.out.print(cherryPickup(m));
    }
}
