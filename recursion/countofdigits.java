package recursion;


public class countofdigits {
    
    public static int countdigits(int n){
        if(n==0)
        return 0;
        return  1 + countdigits(n/10);
    }
    public static void main(String args[]){
        int n = 1234;
        System.out.println(countdigits(n));
    }
    
}
