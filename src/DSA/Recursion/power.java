package DSA.Recursion;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println( powerOf(n ,m));
    }

//    private static int powerOf(int n, int m) {
//        if(m==0) return 1;
//        return n*powerOf(n,m-1);
//    }
    private static int powerOf(int n, int m) {
        if(m==0) return 1;
        int ans = powerOf(n,m/2);
        if(m%2==0) return ans*ans;
        else return ans * ans * n;
    }
}
