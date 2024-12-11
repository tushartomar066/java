package classWork;

import java.util.Scanner;

public class sumOffirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        str = str + n;
        int sum = (str.charAt(0) + str.charAt(str.length() - 1));
        System.out.println(sum);
    }
}
