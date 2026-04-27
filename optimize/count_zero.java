import java.util.Arrays;

public class count_zero{

    public static int countzero(int n, int[] dp){
        if(n==0) return 0;
        if(dp[n] != -1) return dp[n];
        if(n%10 == 0)
        {
            dp[n] = 1+countzero(n/10,dp);
        }else{
            dp[n]=countzero(n/10,dp);
        }
        return dp[n];
    }
    public static void main(String args[]) {
        int n = 1020303040;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(countzero(n, dp));

        
    }
    
}
