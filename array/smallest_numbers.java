public class smallest_numbers {
     public static int smallestNumber(int[] numbers){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        return smallest;

    }
    public static void main(String[] args) {
        int numbers[]={9,5,6,74,3,6,7,8};
        System.out.println(smallestNumber(numbers));
        
    }
    
}
    

