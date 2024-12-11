package Core.Topic_14_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        // compile is a static method in a Pattern class

        Pattern p = Pattern.compile(s2);

        // matcher is a method in a Pattern class
        Matcher m = p.matcher(s1);
        int count = 0;
        while (m.find()) {
            count++;
        }
        System.out.println(count);
       StringBuilder sb = new StringBuilder();

    }
}
