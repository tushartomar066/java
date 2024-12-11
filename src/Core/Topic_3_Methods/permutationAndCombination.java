package Core.Topic_3_Methods;

import java.util.Scanner;

public class permutationAndCombination {
    public int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    public int permu(int a, int b) {
        int z = a - b;
        return factorial(a) / factorial(z);
    }

    public int combination(int a, int b) {
        int z = a - b;
        return factorial(a) /( factorial(z) * factorial(b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        permutationAndCombination permutation = new permutationAndCombination();
        System.out.println("permutation : " + permutation.permu(a, b));
        System.out.println("combination : " + permutation.combination(a, b));
    }
}
