package Core.Topic_4_Arrays;

import java.util.Scanner;

public class findDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
        boolean flag = true;
        for (int i = 0; i < size-1; i++) {
            if (arr[i+1] != arr[i] + 1) {
                flag = false;
                System.out.println(arr[i] + 1);
                break;
            }
        }
        if(flag) {
            System.out.println("-1");
        }
    }
}

