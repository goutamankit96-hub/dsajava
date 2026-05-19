public class Calculate_sum {
    public static int calcSum(int n){
        if(n == 1){
            return 1;
        }
        int fnm1 = calcSum(n-1);
        int fn = n + fnm1;
        return fn;

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calcSum(n));
        
    }
}