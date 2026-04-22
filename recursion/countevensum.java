public class countevensum {
    public static void countEvenSum(int[] arr,int i,int sum,String curr) {
        if(i==arr.length){
            if(sum%2==0){
                System.out.println(curr);
            }
            return;
        }
        countEvenSum(arr, i+1, sum+arr[i], curr+arr[i]);
        
        countEvenSum(arr, i+1, sum, curr);
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        countEvenSum(arr, 0, 0, "");
        
    }g
    
}
