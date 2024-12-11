package DSA.Recursion;

import java.util.Scanner;

public class climbStairs {
    public static int countStair(int n) {
        if (n < 0) return 0;
        if (n == 1 ) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        return countStair(n - 1) + countStair(n - 2) + countStair(n - 3);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countStair(n));
    }
}
