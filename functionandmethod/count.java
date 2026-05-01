public class count {
    public static boolean countofkey(int[] arr, int i,int key){
        
        if(i == arr.length) return false;
        if(arr[i] == key) return true;
        return  countofkey(arr,i+1,key);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5,6,7,8,9,10};
        int key = 9;
        int i = 0;
          System.out.println(countofkey(arr,i,key));
    }

    
}
