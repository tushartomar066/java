package Core.Topic_6_2_D_Arrays;

import java.util.Scanner;

public class storing_roll_number_with_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of students : ");
        int students = sc.nextInt();
        int[][] arr = new int[students][2];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.print("enter the roll no. ");
                    arr[i][j] = sc.nextInt();
                } else {
                    System.out.print("enter the marks for the student : ");
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println();
        }
        for (int[] ele : arr) {
            for (int x : ele) {
                System.out.println(x);
            }
        }
    }
}
