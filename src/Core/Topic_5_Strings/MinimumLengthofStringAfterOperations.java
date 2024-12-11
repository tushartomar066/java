package Core.Topic_5_Strings;

import java.util.Scanner;

public class MinimumLengthofStringAfterOperations {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String s = scanner.nextLine();

        int result = minimumLength(s);
        System.out.println(result);

        scanner.close();
    }

    private static int minimumLength(String s) {
        if (s.length() == 1) return 1;
        int i = 0;
        int j = s.length() - 1;
        while (s.charAt(0) == s.charAt(s.length() - 1)) {

            s = s.substring(1, s.length() - 1);
            if (s.isEmpty()) return 0;

        }
        return s.length();

    }

}
