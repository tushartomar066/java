package Core.Topic_3_Methods;

import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        int power = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while (n != 0) {
            int temp = n % 10;
            res = res + (temp * (int) Math.pow(2, power));
            power = power + 1;
            n = n / 10;
        }
        System.out.println("the decimal number is " + res);
    }
}
