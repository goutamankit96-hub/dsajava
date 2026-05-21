public class QuickSort {

    // Quick Sort Function
    public static void quickSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        // pivot index
        int pIdx = partition(arr, si, ei);

        // left part
        quickSort(arr, si, pIdx - 1);

        // right part
        quickSort(arr, pIdx + 1, ei);
    }

    // Partition Function
    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei]; // last element as pivot
        int i = si - 1;      // to make place for smaller elements

        for (int j = si; j < ei; j++) {

            if (arr[j] <= pivot) {
                i++;

                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;

        // place pivot at correct position
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i; // pivot index
    }

    // Print Array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main Function
    public static void main(String args[]) {

        int arr[] = {6, 3, 9, 8, 2, 5};

        quickSort(arr, 0, arr.length - 1);

        printArr(arr);
    }
}