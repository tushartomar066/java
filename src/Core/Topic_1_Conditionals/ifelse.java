package Core.Topic_1_Conditionals;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int a = sc.nextInt();
        if(a>10) System.out.println("the entered number is greater than 10");
        else System.out.println("number is not greater than 10");
    }
}
