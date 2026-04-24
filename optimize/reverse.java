

import java.util.Arrays;

public class reverse {
    public static int reverseDigits(int n , int[] dp){
        if(n==0)
        {
            return rev;
        }
        
         if(dp[n]!=-1){
            return dp[n];
         }
         dp[n]=rev = rev* 10 + n%10
         dp[n]=reverseDigits(n/10);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 12234;
          int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(reverseDigits(n, dp));

        
    }
    
}
