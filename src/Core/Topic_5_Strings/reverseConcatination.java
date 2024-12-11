package Core.Topic_5_Strings;

import java.util.Scanner;

public class reverseConcatination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        int i = str.length() - 1;
        while (i >= 0) {
            str.append(str.charAt(i));
            i--;
        }
        System.out.println(str);
    }
}
