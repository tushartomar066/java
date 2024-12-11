package Core.Topic_6_2_D_Arrays;

import java.util.Scanner;

public class sumOfRectangleI {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 8, 1, 12},
                {7, 10, 5, 13},
                {6, 4, 9, 14},
                {22, 45, 67, 89}
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the column 1: ");
        int col1 = sc.nextInt() - 1;
        System.out.print("enter the row 1: ");
        int row1 = sc.nextInt() - 1;
        System.out.print("enter the column 2: ");
        int col2 = sc.nextInt() - 1;
        System.out.print("enter the row 2: ");
        int row2 = sc.nextInt() - 1;

        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);

    }
}
