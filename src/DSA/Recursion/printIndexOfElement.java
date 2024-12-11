package DSA.Recursion;

import java.util.Scanner;

public class printIndexOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        printer(arr, 0 ,target);
    }

    private static void printer(int[] arr, int i , int target) {
        if (i == arr.length) {
            System.out.println("-1");
            return;
        }
        if(arr[i]==target) {
            System.out.println(i);
            return;
        }
        printer(arr , i+1 , target);
    }
}
