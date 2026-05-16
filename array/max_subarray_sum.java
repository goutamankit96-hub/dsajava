public class max_subarray_sum {
  
    public static void maxSubArray(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                int curSum=0;
                for(int k=start; k<=end; k++){
                    //SubArray sum
                    currSum+=numbers[k];

                }
                 System.out.println("current sum =  " +currSum);
                 if(maxSum<currSum){
                    maxSum=currSum;
                 }
               
            }
           
        }
         System.out.println("maxSum = " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6};
        maxSubArray(numbers);
    
}
    }
