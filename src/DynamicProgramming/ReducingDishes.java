package DynamicProgramming;

import java.util.Arrays;

public class ReducingDishes {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int[] dp = new int[n+1];
        for(int k = n-1; k>=0;k-- ){
            int sum =0;
            for(int i=k;i<n;i++) {
                sum+= satisfaction[i] * (i-k+1);
            }
            dp[k] = Math.max(sum, dp[k+1]);
        }
        return dp[0];
    }

    public static void main(String[] args) {

    }
}
