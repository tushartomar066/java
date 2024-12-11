package DSA.Recursion;

import java.util.Scanner;


public class skipAcharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        print(str, ch, 0);
        skipChar(str,"",0);
    }

    private static void print(String str, char ch, int i) {
        if (i == str.length()) return;
        if (str.charAt(i) != ch) {
            System.out.print(str.charAt(i));
        }
        print(str, ch, i + 1);


    }

    private static void skipChar(String str, String ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            return;

        }
        if (str.charAt(i) != 'a') skipChar(str, ans + str.charAt(i), i + 1);
        else skipChar(str, ans, i + 1);
    }
}
