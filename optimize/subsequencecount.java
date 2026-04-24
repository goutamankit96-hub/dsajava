import java.util.Arrays;

public class subsequencecount{
    public static int subcount(String str,int i,int[] dp){
        if(i == str.length()) return 1;
        if(dp[i]!= -1) return dp[i];
        int x = subcount(str, i+1, dp);
        int y = subcount(str, i+1, dp);
        dp[i]=x+y;
        return dp[i];
    }
    public static void main(String[] args) {
        String str = "abc";
        int[] dp= new int[str.length() + 1];
        Arrays.fill(dp,-1);
        int i = 0;
        System.out.println(subcount(str, i, dp));
    }
}