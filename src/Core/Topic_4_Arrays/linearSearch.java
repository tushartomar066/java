package Core.Topic_4_Arrays;

import java.util.Scanner;

public class linearSearch {
    public static int linearSearch(int arr[], int key, int n) {
        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key value : ");
        int key = sc.nextInt();
        int ans = linearSearch(arr, key, n);
        System.out.println("index of key value is : " + ans);


    }
}
