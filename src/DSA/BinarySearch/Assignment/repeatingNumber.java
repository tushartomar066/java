package DSA.BinarySearch.Assignment;

import java.util.Scanner;

public class repeatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int high = arr.length-1;
        int low = 0;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if(arr[mid]==mid+1){
                low = mid+1;
            }
            else high = mid-1;
        }
        int exception = arr.length;
        if(low>exception-1) System.out.println("-1");
        else System.out.println(arr[low]);
    }
}
