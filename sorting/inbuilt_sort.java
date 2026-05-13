import java.util.Arrays;

// import java.util.Collections;
public class inbuilt_sort {
    public static void inbuiltSort(int arr[]){
        //Assending order
         Arrays.sort(arr);
        // Arrays.sort(arr,0,3);
        //dissendingorder
        // Arrays.sort(arr,Collections.reverseOrder());


    }
     public static void printArr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+ " ");
            }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,1,7};
        inbuiltSort(arr);
        printArr(arr);
        
    }
    
}
    
    

