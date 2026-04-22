

public class twopair {
     static void twoPairs(String p, String up, int k){
        if(p.length()==k){
            System.out.println(p);
            return;
        }
        if(up.isEmpty()) return;
        char ch = up.charAt(0);
        twoPairs(p+k, up.substring(1), k);
        twoPairs(p, up.substring(1), k);
    }   
    public static void main(String[] args){
        String up ="abcd";
        String p ="";
        int k = 2;
        twoPairs(p, up, k);
    }
    
}
