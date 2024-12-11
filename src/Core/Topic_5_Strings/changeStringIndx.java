package Core.Topic_5_Strings;

import java.util.Scanner;

public class changeStringIndx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char dc = str.charAt(i);
            if (i % 2 == 0) {
                s += 'a';
            } else {
                s += str.charAt(i);
            }
        }
        System.out.println(s);
    }
}
