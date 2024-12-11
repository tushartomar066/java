package DSA.classwork;

import java.util.Scanner;

public class gcd {
    public static int hcf(int a, int b) {
        int low = Math.min(a, b);
        int high = Math.max(a, b);
        int rem = high % low;
        if (rem == 0) {

            return low;
        }
        return hcf(rem, low);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(hcf(a,b));
    }
}
