public class largest_number {
    public static int largestNumber(int[] numbers){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int numbers[]={3,5,6,74,3,6,7,8};
        System.out.println(largestNumber(numbers));
        
    }
    
}