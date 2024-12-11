package Core.Topic_4_Arrays;

import java.util.Scanner;

public class firstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();

        for (int i = 0; i < size; i++) {
            boolean flag = false;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

