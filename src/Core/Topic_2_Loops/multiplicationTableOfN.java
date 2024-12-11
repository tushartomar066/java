package Core.Topic_2_Loops;

import java.util.Scanner;

public class multiplicationTableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=10 ; i++){
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
