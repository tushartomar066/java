package DSA.Recursion;

public class printElementOfArray {
    public static void printer(int[] arr, int i) {
        if (i == arr.length) return;
        System.out.print(arr[i]+ " ");
        printer(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printer(arr, 0);
    }
}
