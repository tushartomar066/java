package DSA.BinarySearch.Assignment;

import java.util.Scanner;

public class countNoOnes {
    public static int noOfOnes(int[] arr) {
        if (arr[0] == 1) return arr.length;
        if (arr[(arr.length - 1)] == 0) return 0;
        int high = arr.length - 1;
        int low = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 0) {
                if (mid != arr.length - 1) {
                    low = mid + 1;
                }
            }
            if (arr[mid] > 0) {
                high = mid - 1;
            }
        }
        return arr.length - low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(noOfOnes(arr));
    }
}

