public class First_occurance {
    public static int firstOccur(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccur(arr, key ,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,7,5,8,5,7,5};
        System.out.println(firstOccur(arr, 5, 0));
    }
    
}
