package Core.Topic_3_Methods;

import java.util.Scanner;

public class decimalToBinary {
    public static void conv(int n) {
        int power = 0;
        int res = 0;
        while (n > 0) {
            int rem = n % 2;
            res = res + (rem * (int) Math.pow(10, power));
            power+=1;
            n = n / 2;
        }
        System.out.print(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        conv(n);
    }

}
