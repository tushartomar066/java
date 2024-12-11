package Core.Topic_5_Strings;

import java.util.Scanner;

public interface reverseSecondHalf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        int n = str.length() / 2;
        int i = n;
        int j = str.length() - 1;
        while (i <= j) {
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, temp);
            i++;
            j--;
        }

        System.out.println(str);

    }
}