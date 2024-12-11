package DSA.Recursion;

import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

        private static int sum(int n) {
        int sum = 0;
        if(n==0) return sum;
        return n+sum(n-1);
    }
//    private static int sum(int n, int sum) {
//        if (n == 0) return sum;
//        return sum(n - 1, sum + n);
//    }
}
