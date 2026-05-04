public class binary_search {
     public static int binarySearch(int[] numbers,int key){
       int start = 0;
       int end = numbers.length-1;
       while(start<=end){
        //mid calculate
        int mid = (start+end)/2;
        //comparison
        if(numbers[mid]==key){
            return mid;
        }
        if(numbers[mid]<key){
            start=mid+1;
        }else{
            end=mid-1;
        }
        return mid;

       }
       return -1;

    }
    public static void main(String[] args){
        int numbers[] = {5,8,4,3,7,6,2,1,9};
        int key = 6;
        System.out.println(binarySearch(numbers, key));
        
}
}
