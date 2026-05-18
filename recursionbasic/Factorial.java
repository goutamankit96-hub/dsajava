
public class Factorial {
    public static int factorial_number(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = factorial_number(n-1);
        int fn = n * factorial_number(n-1);
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial_number(n));
        
    }
    
}
