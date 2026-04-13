

public class sumofdigits {
    public static int sumofdigits(int[] arr, int i){
        if(i == arr.length)
        return 0;
        return arr[i] + sumofdigits(arr, i+1);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int i = 0;
          System.out.println(sumofdigits(arr,i));
    }

}

    

