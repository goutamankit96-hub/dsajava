public class update_ith_bit {
     public static int SetIthBit(int n, int i){
        int bitMask = 1<<i;
        return n| bitMask;
    
}
  public static int ClearIthBit(int n, int i){
      
     int bitMask = ~(1<<i);
        return n & bitMask;
     }
     public static int UpdateIthIbit(int n,int i,int newBit){
        // if(newBit==0){
        //     return ClearIthBit(n,i);
        // }
        // else{
        //     return SetIthBit(n,i);
        // }
        //METHOD 2
        n = ClearIthBit(n,i);
        int bitMask=newBit<<i;
        return n | bitMask;
     }
     public static void main(String[] args) {
      
        System.out.println(UpdateIthIbit(10, 2, 1));
     }
    }
