//Given a sorted array of n elements and a target ‘x’. Find the last occurrence of ‘x’ in the array. If ‘x’ does
//not exist return -1.

package DSA.BinarySearch.Assignment;

import java.util.Scanner;

public class lastOccurance {
    public static int lastOccurance(int[] arr , int target){
        int high = arr.length-1;
        int low = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                if(mid!=arr.length-1 && arr[mid+1]==target){
                    low = mid+1;
                }
                else{
                    return mid;
                }
            }
            if(arr[mid]>target){
                high=  mid-1;
            }
            else low = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(lastOccurance(arr , target));
    }
}
