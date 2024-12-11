package DSA.SortingAlgorithm.QuickSort;

public class quickSortt {

    // Swap method to exchange elements in the array
    private static void swap(int[] arr, int changeIndex, int low) {
        int temp = arr[changeIndex];
        arr[changeIndex] = arr[low];
        arr[low] = temp;
    }

    // Partitioning method to find the correct position of the pivot element
    private static int fn1(int[] arr, int low, int high) {
        int pivotIndex = low;
        int lowCount = 0;

        // Count the number of elements less than or equal to the pivot
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] <= arr[low]) lowCount++;
        }

        // Swap the pivot to its correct position
        int changeIndex = pivotIndex + lowCount;
        swap(arr, changeIndex, pivotIndex);

        // Rearrange elements around the pivot
        int i = low, j = high;
        while (i < changeIndex && j > changeIndex) {
            if (arr[i] > arr[changeIndex] && arr[changeIndex] >= arr[j]) {
                swap(arr, i, j);
                i++;
                j--;
            } else if (arr[i] <= arr[changeIndex]) {
                i++;
            } else if (arr[j] > arr[changeIndex]) {
                j--;
            }
        }
        return changeIndex;
    }

    // QuickSort algorithm
    private static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        // Partition the array and get the pivot index
        int pivotIndex = fn1(arr, low, high);

        // Recursively sort the subarrays
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 1, 2, 3, 6, 5, 8};
        int n = arr.length;

        // Perform QuickSort
        quickSort(arr, 0, n - 1);

        // Print the sorted array
        printer(arr);
    }

    // Method to print the array
    private static void printer(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
