public class MergeSort {

    // Merge Sort Function
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        // Find mid
        int mid = si + (ei - si) / 2;

        // Left part
        mergeSort(arr, si, mid);

        // Right part
        mergeSort(arr, mid + 1, ei);

        // Merge
        merge(arr, si, mid, ei);
    }

    // Merge Function
    public static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];

        int i = si;       // iterator for left part
        int j = mid + 1;  // iterator for right part
        int k = 0;        // iterator for temp array

        // Compare and merge
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Left part remaining
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Right part remaining
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
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
        int arr[] = {6, 3, 9, 5, 2, 8};

        mergeSort(arr, 0, arr.length - 1);

        printArr(arr);
    }
}