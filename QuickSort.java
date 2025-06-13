package project1;
import java.util.Arrays;
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
       
        System.out.println("Original Array: " + Arrays.toString(arr));
          
        quickSort(arr, 0, arr.length - 1);
         

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // QuickSort function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array
            int mid = (low+high)/2;

            // Recursively sort left and right parts
            quickSort(arr, low, mid - 1);
            quickSort(arr, mid + 1, high);
        }
    }

    // Partition function
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivot element
        int i = low - 1;        // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is less than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return pivot index
    }
}
