package Core.Topic_4_Arrays;

import java.util.Scanner;

public class largest {
    public static int largestInArray(int arr[]) {
        int max = -1234;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maximumElement = largestInArray(arr);
        System.out.println("The largest Element in an array is : " + maximumElement);
    }
}
