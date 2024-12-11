package Core.Topic_2_Loops;

import java.util.Scanner;

public class sumOfNaturalNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum  = 0;
        for (int i = 1 ; i<n ; i++){
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
