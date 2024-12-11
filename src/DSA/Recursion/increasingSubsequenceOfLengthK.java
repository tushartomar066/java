package DSA.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class increasingSubsequenceOfLengthK {
    public static void combinations(int n, int k, int start, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp) {
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i <= n; i++) {
            temp.add(i);
            combinations(n, k, i + 1, result, temp);
            temp.removeLast();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        combinations(n, k, 1, result, temp);
        System.out.println(result);
    }
}
