package DSA.Recursion;

import java.util.Scanner;

public class genrateParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        parenthesis(n, "", 0, 0);
    }

    private static void parenthesis(int n, String temp, int open, int close) {
        if (open == close && open == n) {
            System.out.println(temp);
        }
        if (open < n) {
            parenthesis(n, temp + '(', open + 1, close);
        }
        if (open > close) {
            parenthesis(n, temp + ')', open, close + 1);
        }


    }
}
