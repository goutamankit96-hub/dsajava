public class sequencialarraysum {
    //    public static int sumofsquencialarray(int[] arr, int i,int sum){
  
    //     if(i == arr.length ){
    //     return sum;
    //     }
    //     int x = sumofsquencialarray(arr, i+1, sum + arr[i]);
    //     int y = sumofsquencialarray(arr, i+1, sum);
    //     return x + y;
      
    //     }
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3};
    //     int i = 0;
    //     int sum = 0;
        
    //     System.out.println(sumofsquencialarray(arr,i,sum));
    // }
     public static int sumofsquencialarray(String str, int n){
  
        if(n == 0 ){
            System.out.println(str);
        return 0;
        }
        int x = sumofsquencialarray(str + "0", n-1);
        int y = sumofsquencialarray(str + "1", n-1);
        return x + y;
      
        }
    public static void main(String[] args) {
       int n=2;
        
        sumofsquencialarray("", n);
    }

}
    

