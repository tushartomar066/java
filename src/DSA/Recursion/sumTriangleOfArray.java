package DSA.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class sumTriangleOfArray {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }
        TriangleSum(arr, result);
        System.out.println(result);
    }

    private static ArrayList<ArrayList<Integer>> TriangleSum(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> result) {
        if (arr.size() == 1) {
            return result;
        }
        ArrayList<Integer> nextLevel = new ArrayList<>();
        for (int i = 1; i < arr.size(); i++) {
            nextLevel.add(arr.get(i) + arr.get(i - 1));
        }
        result.add(new ArrayList<>(nextLevel));
        return TriangleSum(nextLevel, result);
    }

}
