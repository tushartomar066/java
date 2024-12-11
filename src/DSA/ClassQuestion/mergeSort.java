package DSA.ClassQuestion;

public class mergeSort {
    static  int count;
    public static void merge(int[] arr) {
        int n = arr.length;
        if (n == 1) return;

        /* first array of n/2 elements */
        int[] a = new int[n / 2];
        for (int i = 0; i < n / 2; i++) {
            a[i] = arr[i];
        }

        /* second array of remaining element */
        int[] b = new int[n - n / 2];
        for (int i = 0; i < n - n / 2; i++) {
            b[i] = arr[i + n / 2];
        }

        merge(a);
        merge(b);
        countInversion(a, b);
        mergeRest(a, b, arr);
        a = null;
        b = null;
    }

    private static void countInversion(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                count += a.length - i;
                j++;
            } else i++;
        }
    }

    private static void mergeRest(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while (j < b.length) c[k++] = b[j++];
        while (i < a.length) c[k++] = a[i++];
    }

    private static void printResult(int[] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        count = 0;
        merge(arr);
        printResult(arr);
        System.out.println();
        System.out.println(count);
    }
}
