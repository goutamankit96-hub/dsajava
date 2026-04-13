package lect1;


public class recursion {
    
    static int power(int x, int n)
    {
        if(n==0){
            return  1;
        }
        return x*power(x, n-1);
    }
    public static void main(String args[]){
        int x=4;
        int n=5;
        System.out.println(power(x,n));
        
    }
    
}
