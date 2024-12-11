package Core.Topic_5_Strings;

import java.util.Scanner;

public class printAllSubstring {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }

    }
}
