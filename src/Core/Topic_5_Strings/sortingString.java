package Core.Topic_5_Strings;

import java.util.Scanner;


public class sortingString {
    public static void swapper(char arr[], int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        char[] arr = str.toString().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapper(arr, j, j + 1);
                }
            }
        }
        for (char ele : arr){
            System.out.print(ele);
        }
    }
}
