package DSA.Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubStrings {

    public static ArrayList<String> Substrings(String str, String temp, int j) {
        if (j == str.length()) {
            ArrayList<String> ar2 = new ArrayList<>();
            ar2.add(temp);
            return ar2;
        }
        ArrayList<String> arr = new ArrayList<>();

        arr.addAll(Substrings(str, temp + str.charAt(j), j + 1));
        arr.addAll(Substrings(str, temp, j + 1));
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> arr = Substrings(s, "", 0);
        Collections.sort(arr);
        System.out.print(arr);


    }
}
