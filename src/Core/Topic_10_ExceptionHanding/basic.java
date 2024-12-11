package Core.Topic_10_ExceptionHanding;


public class basic {
    public static void main(String[] args) {
        int[] arr1 = {1000, 100, 10, 1};
        int[] arr2 = {1, 2, 3, 4};
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(divideOfArray(arr1[i], arr2[i]));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index out of bound ");
        }
    }

    private static int divideOfArray(int i, int i1) {
        try {
            return i / i1;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero exception");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
        return -1;
    }
}
