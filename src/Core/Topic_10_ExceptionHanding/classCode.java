package Core.Topic_10_ExceptionHanding;

import java.util.Arrays;

public class classCode {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            System.out.println(arr[9]);
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
            ; // give stack trace of error
            System.out.println(e.getMessage());  // only the error
            System.out.println(e.getCause());
        }
    }
}
