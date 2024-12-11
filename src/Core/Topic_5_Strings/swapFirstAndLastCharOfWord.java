package Core.Topic_5_Strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class swapFirstAndLastCharOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        int j = 0;
        while (i < sb.length() && j < sb.length()) {
            if (sb.charAt(j) == ' ') {
                char ch = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j - 1));
                sb.setCharAt(j-1, ch);
                i = j+1;
            }
            j++;
        }
        System.out.println(sb);
    }
}
