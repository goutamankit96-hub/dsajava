package recursion;


public class reverse {
    int rev = 0;
   public static int reverse(int n){
        if(n==0)
        {
            return rev;
        }
        rev = rev* 10 + n%10;
        return reverse(n/10);


    }

    public static void main(String args[]){
        int n = 1234;
        System.out.println(reverse(n));
    }
}
