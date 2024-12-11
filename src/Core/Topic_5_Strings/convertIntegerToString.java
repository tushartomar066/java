package Core.Topic_5_Strings;

import java.util.Scanner;

public class convertIntegerToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        str += str + n;
        System.out.println(str);
        System.out.println(str.getClass().getSimpleName());

    }
}
