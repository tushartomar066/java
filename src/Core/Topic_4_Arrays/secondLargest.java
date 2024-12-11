package Core.Topic_4_Arrays;

import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
        int max = Integer.MIN_VALUE, second_max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            }
            if(arr[i]>second_max && arr[i]!=max) second_max = arr[i];
        }
        System.out.println(second_max);


    }
}
