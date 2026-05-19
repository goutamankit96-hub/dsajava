public class Tiling {
    public static int tilingProblem(int n){ //2 * n tiling
        // Base case
        if(n == 0 || n == 1){
            return 1;
        }
        //kaam
        //verticle 
        int fnm1 = tilingProblem(n-1);
         
        //horizontal
        int fnm2 = tilingProblem(n-2);
         
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
        System.out.println(tilingProblem(4));
        
    }
    
}
