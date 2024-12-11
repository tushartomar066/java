package Core.Topic_4_Arrays;

import java.util.Scanner;

public class nextGreatestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int maxEle = arr[size-1];
        arr[size-1] = -1;
        for (int i = size-2 ; i>=0 ; i--){
            arr[i] = maxEle;
            maxEle = Math.max(arr[i] , maxEle);
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}
