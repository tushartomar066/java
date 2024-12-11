package DSA.Recursion;

import java.util.Scanner;

public class generateBinaryStrings {
    public static void generator(int n, String temp) {
        if (temp.length() == n) {
            System.out.println(temp);
            return;
        }
        if (temp.isEmpty() || temp.charAt(temp.length() - 1) == '0') {
            generator(n, temp + 1);
        }
          generator(n, temp + 0);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generator(n, "");
    }
}
