package Core.Topic_7_OOPS.Lec_6.LambdaFunction;

import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
        arr.forEach((item) -> System.out.println(item * 2));
        Operation sub = (a, b) -> a - b;
        Operation product = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;
        Operation add = (a, b) -> a + b;
        System.out.println();
    }

}

interface Operation {
    int operation(int a, int b);
}