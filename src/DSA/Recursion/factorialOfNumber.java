package DSA.Recursion;

public class factorialOfNumber {
    public static int factorial(int n) {
        int fact = 1;
        if (n == 1) return fact;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
