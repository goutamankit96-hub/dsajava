

import java.util.Arrays;

public class sumOfDigits {
     public static int digitsCount(int n ,int[] dp){
        if(n==0){
            return 0;
        }
          if(dp[n]!=-1){
            return dp[n];
          }
          dp[n]=n%10 + digitsCount(n/10, dp);
          return dp[n];
        

    }
    public static void main(String[] args) {
        int n = 123456;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(digitsCount(n, dp));
        
    }
}
