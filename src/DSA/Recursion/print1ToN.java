package DSA.Recursion;

import java.util.Scanner;

public class print1ToN {
//    public static void print(int i, int n) {
//        System.out.print(i + " ");
//        if (i == n) return;
//        print(i + 1, n);
//    }
    public static void print( int n) {
        if(n==0) return;
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
