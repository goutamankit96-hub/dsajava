


public class countzero {
    public static int countzero(int n){
        if(n == 0)
        return 0;
        int count = (n%10 == 0)? 1 : 0;
        return count + countzero(n/10);
    }
    
    public static void main(String[] args) {
        int n = 1020304;
          System.out.println(countzero(n));
    }

}
