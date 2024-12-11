package classWork;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class happyNumber {
    public static void giver(int n) {
        Set<Integer> usedInt = new HashSet<Integer>();
        while (true) {
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2.0);
                n /= 10;

            }
            if (sum == 1) {
                System.out.println("true");
                return;
            }

            n = sum;
            if (usedInt.contains(n)){
                System.out.println("false");
                return;
            }

            usedInt.add(n);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        giver(n);
    }
}
