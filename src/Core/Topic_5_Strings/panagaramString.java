package Core.Topic_5_Strings;

import java.util.Scanner;

public class panagaramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = new String(sc.nextLine());
        int arr[] = new int[26];
        int index = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                index = ch - 'a';
            } else if (ch >= 'A' && ch <= 'Z') {
                index = ch - 'A';
            } else continue;
            arr[index]++;
        }
        Boolean flag = true;
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) {
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("panagram");
        else System.out.println("not panagram");
    }
}

