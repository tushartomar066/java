package Core.Topic_2_Loops;

import java.util.Scanner;

//1 3 5 7 9 11 13 13 15 17 19
public class Ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        for (int i = 0; i < 2 * n - 1; i++) {
            System.out.println(a);
            a = a + 2;
        }
    }
}
