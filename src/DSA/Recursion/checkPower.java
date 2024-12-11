package DSA.Recursion;

import java.util.Scanner;

public class checkPower {
    public static boolean checker(int a ,int i) {
        if (i > a) return false;
        if (i == a) {
            return true;
        }
        return checker(a,i*2);
    }

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int n = tc.nextInt();
        boolean chk = checker(n,1);
        System.out.println(chk);
    }
}
