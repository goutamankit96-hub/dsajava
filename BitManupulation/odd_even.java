public class odd_even {
    public static void OddOrEven(int n){
        int bitMask=1;
        if((n & bitMask) == 0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
     public static void main(String[] args) {
        OddOrEven(4);
        OddOrEven(7);
        OddOrEven(64);
        
        
    }
    
}
