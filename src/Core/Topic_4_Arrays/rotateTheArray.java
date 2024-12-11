package Core.Topic_4_Arrays;

import java.util.Scanner;

public class rotateTheArray {

// using brute force method

//    public static void myException(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("enter the rotation : ");
//        int rot = sc.nextInt();
//        if (rot > size) rot = rot%size;
//        else {
//            for (int i = 0; i < rot; i++) {
//                int temp = arr[size - 1];
//                for (int j = size-1 ; j > 0; j--) {
//                    arr[j] = arr[j - 1];
//                }
//                arr[0] = temp;
//            }
//        }
//        for(int ele:arr){
//            System.out.println(ele);
//        }
//
//    }


    // using reverse method
    public static void rotate(int[] arr, int high, int low) {
        int i = high;
        int j = low;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the rotation : ");
        int rot = sc.nextInt();
        if (rot > size) rot = rot % size;
        rotate(arr, 0, size - rot - 1);
        rotate(arr, size - rot, size - 1);
        rotate(arr, 0, size - 1);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
