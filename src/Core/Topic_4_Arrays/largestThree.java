package Core.Topic_4_Arrays;

import java.util.Scanner;

public class largestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
        int max = -123, second_max = -1234, third_largest = -123;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) max = arr[i];
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] > second_max && arr[i] != max) {
                second_max = arr[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] > third_largest && arr[i] != max && arr[i] != second_max) {
                third_largest = arr[i];
            }
        }
        System.out.println(third_largest);
    }
}
