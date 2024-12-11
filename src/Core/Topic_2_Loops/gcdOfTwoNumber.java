package Core.Topic_2_Loops;

import java.util.Scanner;

public class gcdOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n < m) {
            if (m % n == 0) {
                System.out.println(n);
            } else {
                for (int i = n; i >= 1; i--) {
                    if (n % i == 0 && m % i == 0) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
        if (n > m) {
            if (n % m == 0) {
                System.out.println(m);
            } else {
                for (int i = m; i >= 1; i--) {
                    if (n % i == 0 && m % i == 0) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}
