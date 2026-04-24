import java.util.Arrays;

public class string_length {
       public static int lencount(String str,int[] dp){
        if(str.equals("")) return 0;
        int len = str.length();
        if(dp[len] != -1){
            return dp[len];
        }
        dp[len] = 1+lencount(str.substring(1),dp);
        return dp[len];
    }
    public static void main(String[] args) {
        String str = "abc";
        int[] dp= new int[str.length() + 1];
        Arrays.fill(dp,-1);
       
        System.out.println(lencount(str, dp));
    }
}
