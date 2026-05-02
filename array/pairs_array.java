public class pairs_array {
    public static void printPairs(int[] numbers) {
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];    //2,3,4,5,6,7
            for(int j=i+1;j<numbers.length;j++){
                System.out.println("(" + curr + "," + numbers[j] + ")");
                tp++;
            }   
        }
        System.out.println("total pairs = " + tp);
        
    }
    public static void main(String[] args) {
        int numbers[] = {2,3,4,5,6,7};
        printPairs(numbers);
    }
    
}
