

import java.util.Arrays;

public class stairsways {
      
    public static int ways(int n, int[] dp){
        if(n==0 | n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=ways(n-1,dp) + ways(n-2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(ways(n,dp));
    }
    
}
