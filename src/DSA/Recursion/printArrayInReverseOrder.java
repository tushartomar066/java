package DSA.Recursion;

public class printArrayInReverseOrder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printer(arr, 0);
    }

    private static void printer(int[] arr, int i) {
        if (i == arr.length) return;
        printer(arr, i + 1);
        System.out.print(arr[i]);
    }
}
