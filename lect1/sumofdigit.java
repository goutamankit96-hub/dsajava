package lect1;


public class sumofdigit {

   public static int sumofdigits(int n)
   { 
    if(n == 0) 
    return 0;
    return n%10 + sumofdigits(n/10);
   }
   public static void main(String args[]){
    int n = 123;
    System.out.println(sumofdigits(n));
   }
    
}
