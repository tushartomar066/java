package DSA.classwork;

public class minSubarrayOfKLength {
    public static int getMin(int arr[], int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int min = sum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i - k];
            min = Math.min(sum, min);
        }
        return min;
    }

    public static void main(String[] args) {


        int[] arr = {4, 5, 1, 6, 2, 8, 4};
        int k = 3;
        System.out.println(getMin(arr, k));


    }
}
