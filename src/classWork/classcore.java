package classWork;

import java.util.Scanner;

public class classcore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 70) System.out.println("first");
        else if (n >= 50 && n < 70) System.out.println("second");
        else if (n >= 30 && n < 50) System.out.println("third");
        else if (n < 30) System.out.println("fail");

    }
}
