package Core.Topic_4_Arrays;

import java.util.Scanner;

public class strictlyGreaterThanx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        System.out.println(count);
    }
}
