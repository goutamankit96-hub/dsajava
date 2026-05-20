public class clear_last_ith_bit {
    public static int ClearLastIthBit(int n ,int i){
        int bitMask=(~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(ClearLastIthBit(15, 2));
    }
    
}
03