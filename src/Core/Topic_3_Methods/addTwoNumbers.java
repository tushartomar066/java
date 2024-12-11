package Core.Topic_3_Methods;

import java.util.Scanner;
public class addTwoNumbers {
    public static int ADD(int a, int b) {
        int res = a + b;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        addTwoNumbers obj = new addTwoNumbers();
        int res = obj.ADD(a, b);
        System.out.println(obj.ADD(a, b));

    }
}
