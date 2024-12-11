package DSA.Recursion;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Scanner;

public class permutations {
    public static ArrayList<String> Permutations(String temp, String org) {
        if (org.length() == 0) {
            ArrayList<String>ans = new ArrayList<>();
            ans.add(temp);
            return ans;
        }
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < org.length(); i++) {
            char ch = org.charAt(i);
            arr.addAll(Permutations(temp + ch, org.substring(0, i) + org.substring(i + 1)));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Permutations("", s));
    }
}
