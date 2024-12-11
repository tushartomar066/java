package DSA.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class maizePath {

    /* counting paths */

    public static int countPath(int dn, int rt, int n) {
        if (dn == n || rt == n) return 0;
        if (dn == n - 1 && rt == n - 1) {
            return 1;
        }
        int ans = countPath(dn + 1, rt, n) + countPath(dn, rt + 1, n);
        return ans;
    }

    /* printing paths */

    public static ArrayList<String> printPath(int dn, int rt, int n, String temp) {
        if (dn == n || rt == n) {
            return new ArrayList<>();
        }
        if (dn == n - 1 && rt == n - 1) {
            ArrayList<String> path = new ArrayList<>();
            path.add(temp);
            return path;
        }
        ArrayList<String> paths = new ArrayList<>();
        paths.addAll(printPath(dn + 1, rt, n, temp + 'D'));
        paths.addAll(printPath(dn, rt + 1, n, temp + 'R'));
        return paths;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
//        int count = countPath(0, 0, n);
//        System.out.println(count);
        ArrayList<String> arr2 = printPath(0, 0, n, "");
        for (String ele : arr2) {
            System.out.println(ele);
        }

    }
}
